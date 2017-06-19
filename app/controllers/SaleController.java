package controllers;

import models.SaleEvent;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Handles API requests for Sale related events.
 */
public class SaleController extends Controller {
    /**
     * Creates and renders the Create Sale Page.
     * @return Renders the Create Sale Page
     */
    @Security.Authenticated(Secured.class)
    public Result createSalePage() {
        return ok(createSalePage.render(User.finduser(request().username())));
    }

    /**
     * Post method for creating a new SaleEvent.
     * @return returns to home-page
     */
    @Security.Authenticated(Secured.class)
    public Result createSale() {
        Form<SaleEvent> saleForm =
                Form.form(SaleEvent.class).bindFromRequest();
        User user = User.finduser(session().get("email"));
        String id = "";
        if (saleForm.hasErrors()) {
            return badRequest(createSalePage.render(user));
        } else {
            SaleEvent sale = new SaleEvent(saleForm.get().name);
            sale.setAddress(saleForm.get().address);
            sale.setStartDate(saleForm.get().startDate);
            sale.setEndDate(saleForm.get().endDate);
            sale.setUserID(session().get("email"));
            sale.save();
            id = sale.ID;

            //************************************
            //Give authority "Admin" to the user. zhhyu 08/07
            if (!user.getAuthority().equals("SuperUser")) {
                user.setAuthority("Admin");
            }
            user.addSaleEventList(sale);
            //user.saveManyToManyAssociations("");
            user.save();
            //************************************
        }

        SaleEvent s = SaleEvent.findSale(id);
        System.out.println(s == null ? 1 : 0);
        return ok(content.render(user, id));
    }

    /**
     * Lists all sales associated with logged in user.
     * @return redirects to sale listing page
     */
    @Security.Authenticated(Secured.class)
    public Result listSales() {
        User user = User.finduser(session().get("email"));
        List<SaleEvent> sales = SaleEvent.findAll();
        for(SaleEvent sale : sales) {
            System.out.println(sale.getUserID());
        }
        if (user.getAuthority().equals("SuperUser")) {
            return ok(listSales.render(SaleEvent.findAll(), user));
        } else {
            List<SaleEvent> toReturn;
            if (user.getAuthority().equals("Admin")) {
                toReturn = user.obtainSaleEventList();
            } else {
                toReturn = new ArrayList<SaleEvent>();
                SaleEvent sale = SaleEvent.getUserSales(session().get("email"));
                toReturn.add(sale);
            }
            return ok(listSales.render(toReturn, user));
        }
    }

    /**
     * Opens a page displaying information on SaleEvent
     * with the ability to edit and delete.
     * @param id the ID of a particular SaleEvent
     * @return displays information for edit on particular sale
     */
    @Security.Authenticated(Secured.class)
    public Result saleInfo(final String id) {
        User user = User.finduser(session().get("email"));
        SaleEvent sale = SaleEvent.findSale(id);
        if (user.getAuthority().equals("SuperUser")
                || user.getAuthority().equals("Admin")) {
            return ok(saleInfoPriveleged.render(sale));
        } else {
            return ok(saleInfo.render(sale));
        }
    }

    /**
     * Closes a SaleEvent which prevents further edits.
     * @param id id of SaleEvent to close
     * @return sale is closed
     */
    public Result closeSale(final String id) {
        SaleEvent sale = SaleEvent.findSale(id);
        if (sale.isClosed()) {
            sale.setClosed(false);
        } else {
            sale.setClosed(true);
        }
        sale.save();
        return ok(saleInfoPriveleged.render(sale));
    }

    /**
     * Post method for the editing of a SaleEvent.
     * @param id the ID for a particular SaleEvent
     * @return redirects to SaleEvent listing
     */
    @Security.Authenticated(Secured.class)
    public Result updateSale(final String id) {
        SaleEvent sale = SaleEvent.findSale(id);
        if (sale.isClosed()) {
            return redirect(routes.SaleController.saleInfo(id));
        } else {
            Form<SaleInfo> info =
                    Form.form(SaleInfo.class).bindFromRequest();
            sale.setName(info.get().name.length() > 0
                    ? info.get().name : sale.name);
            sale.setAddress(info.get().address.length() > 0
                    ? info.get().address : sale.address);
            sale.setStartDate(info.get().startDate.length() > 0
                    ? info.get().startDate : sale.startDate);
            sale.setEndDate(info.get().endDate.length() > 0
                    ? info.get().endDate : sale.endDate);
            sale.save();
            return redirect(routes.SaleController.saleInfo(id));
        }
    }

    /**
     * Deletes a given SaleEvent.
     * @param id id of SaleEvent to be deleted
     * @return redirects to list of SaleEvents
     */
    @Security.Authenticated(Secured.class)
    public Result deleteSale(final String id) {

        List<User> users = User.findAll();
        SaleEvent sale = SaleEvent.findSale(id);

        for (User user:users) {
            List<SaleEvent> saleEventList = user.obtainSaleEventList();

            Iterator<SaleEvent> iterator = saleEventList.iterator();
            while (iterator.hasNext()) {
                SaleEvent tempEvent = iterator.next();
                if (tempEvent.equals(sale)) {
                    iterator.remove();
                }
            }
            user.save();
        }

        SaleEvent.deleteSale(id);
        return redirect(routes.SaleController.listSales());
    }

    /**
     * Allows user to download a financial report text document.
     * @param id the id of SaleEvent to print report
     * @return downloadable txt document
     */
    public Result viewFinancialReport(final String id) {
        SaleEvent sale = SaleEvent.findSale(id);
        String fileName = sale.getEndDate()
                + "_" + sale.getName()
                + "_report.txt";
        response().setContentType("application/x-download");
        response().setHeader("Content-disposition",
                "attachment; filename=" + fileName);
        return ok(new File(sale.printFinancialReport()));
    }

    /**
     * Prints a financial report containing info on unsold items
     * @param id of SaleEvent
     * @return downloadable txt document
     */
    public Result viewAltFinancialReport(final String id) {
        SaleEvent sale = SaleEvent.findSale(id);
        String fileName = sale.getEndDate()
                + "_" + sale.getName()
                + "_report.txt";
        response().setContentType("application/x-download");
        response().setHeader("Content-disposition",
                "attachment; filename=" + fileName);
        return ok(new File(sale.printAlternativeFinancialReport()));
    }

    @Security.Authenticated(Secured.class)
    public static class SaleInfo {
        /**
         * String name of sale.
         */
        public String name;
        /**
         * String address of sale.
         */
        public String address;
        /**
         * String startDate of sale.
         */
        public String startDate;
        /**
         * String endDate of sale.
         */
        public String endDate;
    }
}
