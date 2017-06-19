package controllers;

import models.SaleEvent;
import models.User;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles API requests for User related events.
 */
public class UserController extends Controller {

    /**
     * Static class representing a User form.
     */
    @Security.Authenticated(Secured.class)
    public static class UserForm {

        /**
         * String email of user.
         */
        public String email;
        /**
         * String name of user.
         */
        public String name;
        /**
         * String user's role.
         */
        public String authority;
        /**
         * boolean isLocked account locked.
         */
        public boolean isLocked;
    }

    //------------Search and Assign users----------------
    /**
     * Search all the items under the specific event.
     * @return displays information for all the items under the specific event
     */
    @Security.Authenticated(Secured.class)
    public Result searchUser() {
        Form<UserForm> userform = Form.form(UserForm.class);
        List<User> users = User.findAll();
        return ok(searchUser.render(
                userform, users, User.finduser(request().username())));
    }
    /**
     * Post method for the search all the items.
     * @return redirects to sale event page
     */
    public Result postsearchUser() {

        Form<UserForm> userForm = Form.form(
                UserForm.class).bindFromRequest();
        User user = User.finduser(userForm.get().email);

        //System.out.println(user.email);

        DynamicForm requestData = Form.form().bindFromRequest();
        if (requestData.get("Unlock") != null) {
            user.setislocked(false);
            user.save();
        } else if (requestData.get("Change") != null) {
            user.setAuthority(userForm.get().authority);
            user.save();
        } else if (requestData.get("Delete") != null) {
            user.delete();
        }

        return redirect(
                routes.UserController.searchUser());
    }
    //----------------------------------------------------------

    //------------Assign roles for a saleevent-----------
    /**
     * Search all the items under the specific event.
     * @param id id of SaleEvent
     * @return displays information for all the items under the specific event
     */
    @Security.Authenticated(Secured.class)
    public Result assignAdmin(final String id) {
        Form<UserForm> userForm = Form.form(UserForm.class);
        List<User> users = User.findAll();
        SaleEvent sale = SaleEvent.findSale(id);

        List<User> usersWithoutSale = new ArrayList<User>();
        for (User user:users) {

            boolean isContained = false;
            List<SaleEvent> userSaleList = user.obtainSaleEventList();
            for (SaleEvent usersale:userSaleList) {
                if (usersale.equals(sale)) {
                    isContained = true;
                }
            }

            if (!isContained) {
                if (!user.getAuthority().equals("SuperUser")) {
                    usersWithoutSale.add(user);
                }
            }
        }

        return ok(assignAdmin.render(
                userForm, usersWithoutSale, User.finduser(
                        request().username()), id));
    }
    /**
     * Post method for the search all the items.
     * @param id id of SaleEvent
     * @return redirects to sale event page
     */
    public Result postassignAdmin(final String id) {

        Form<UserForm> userForm = Form.form(UserForm.class).bindFromRequest();
        User user = User.finduser(userForm.get().email);
        SaleEvent sale = SaleEvent.findSale(id);
        //System.out.println(user.email);

        DynamicForm requestData = Form.form().bindFromRequest();
        if (requestData.get("authority") != null) {

            if (!user.getAuthority().equals("SuperUser")) {
                user.setAuthority(userForm.get().authority);
                if (userForm.get().authority.equals("Admin")) {
                    user.setAuthority("Admin");
                    user.addSaleEventList(sale);
                }
                if (userForm.get().authority.equals("Seller")) {
                    user.setAuthority("Seller");
                    user.setSaleEventID(id);
                }
                if (userForm.get().authority.equals("Clerk")) {
                    user.setAuthority("Clerk");
                    user.setSaleEventID(id);
                }
                if (userForm.get().authority.equals("Cashier")) {
                    user.setAuthority("Cashier");
                    user.setSaleEventID(id);
                }
                if (userForm.get().authority.equals("Bookkeeper")) {
                    user.setAuthority("Bookkeeper");
                    user.setSaleEventID(id);
                }
            }
            user.save();
        }
        return redirect(
                routes.UserController.assignAdmin(id));
    }
    //----------------------------------------------------------
    //*******************************************************************
}
