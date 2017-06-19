package controllers;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;
import models.SaleEvent;
import models.User;
import models.Item;
import play.api.Play;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.data.DynamicForm;
import scala.collection.mutable.Buffer;
import scala.xml.PrettyPrinter;
import views.html.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.ArrayList;
import play.mvc.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;
import play.data.*;
import play.Environment.*;
import play.data.Form;

import javax.imageio.ImageIO;
import javax.inject.Inject;

import static play.data.Form.form;

/**
 * Handles API requests for Item related events.
 */
public class ItemController extends Controller {
    /**
     * Class representing an Item form.
     */
    @Security.Authenticated(Secured.class)
    public static class Itemform {

        /**
         * String name of item.
         */
        public String name;
        /**
         * String price of item.
         */
        public String price;

        public String minPrice;
        /**
         * String location of item.
         */
        public String location;
        /**
         * String description of item.
         */
        public String description;
        /**
         * int quantity of item in stock.
         */
        public int quantity;
    }

    //------------------Add item----------------
    /**
     * Creates and renders the Add item Page.
     * @param id of SaleEvent
     * @return Renders the Add itemPage
     */
    @Security.Authenticated(Secured.class)
    public Result addItem(final String id) {
        Form<Itemform> userForm = Form.form(Itemform.class);
        SaleEvent sale = SaleEvent.findSale(id);
        return ok(additem.render(
                userForm, User.finduser(request().username()), sale));
    }
    /**
     * Post method for adding new item.
     * @param id of SaleEvent
     * @return returns to sale page
     */
    @Security.Authenticated(Secured.class)
    public Result postaddItem(final String id) {
        SaleEvent sale = SaleEvent.findSale(id);
        if (sale.isClosed()) {
            return redirect(
                    routes.SaleController.saleInfo(id));
        } else {
            Form<Itemform> userForm = Form.form(
                    Itemform.class).bindFromRequest();

            //************************************
            Item item =  new Item(userForm.get().name,
                    userForm.get().price,
                    userForm.get().location,
                    userForm.get().description,
                    userForm.get().quantity);
            if (userForm.get().minPrice.length() > 0) {
                item.setMinimumPrice(userForm.get().minPrice);
            } else {
                item.setMinimumPrice(userForm.get().price);
            }
            item.setSaleEventID(id);
            item.setSellername(User.finduser(request().username()).name);
            item.save();
            if (User.finduser(request().username()).getAuthority() == "Seller") {
                return redirect(routes.HomeController.content());
            } else {
                return redirect(
                        routes.SaleController.saleInfo(id));
            }
        }
    }
    //---------------------------------------------

    /**
     * ItemID form.
     */
    @Security.Authenticated(Secured.class)
    public static class ItemID {
        /**
         * String action to take for item deletion.
         */
        public String action;
        /**
         * Integer id of item.
         */
        public Integer id;
    }

    //------------Search and delete item----------------
    /**
     * Search all the items under the specific event.
     * @param id the id of a particular SaleEvent
     * @return displays information for all the items under the specific event
     */
    @Security.Authenticated(Secured.class)
    public Result searchItem(final String id) {
        Form<ItemID> userForm = Form.form(ItemID.class);

        List<Item> items = Item.findSaleEvent(id);
        SaleEvent sale = SaleEvent.findSale(id);
        //return ok(toJson(items));
        return ok(searchitem.render(
                userForm, items, User.finduser(request().username()), sale));
    }

    /**
     * Post method for the search all the items.
     * @return redirects to sale event page
     */
    public Result postsearchItem() {
        Form<ItemID> userForm = Form.form(ItemID.class).bindFromRequest();
        Item item = Item.finditem(userForm.get().id);
        String saleID = item.getSaleEventID();
        int itemId = userForm.get().id;

        DynamicForm requestData = Form.form().bindFromRequest();
        if (requestData.get("Delete") != null) {
            item.delete();
        } else if (requestData.get("Update") != null) {
            Form<updateItemForm> updateForm = Form.form(updateItemForm.class);
            return redirect(
                    routes.ItemController.updateItem(itemId));
        }

        return redirect(
             routes.ItemController.searchItem(saleID));
    }
    //----------------------------------------------------------

    //--------------------Search Unsolded item-------------------
    /**
     * Search unsolded items under the specific event.
     * @param id the id of a particular SaleEvent
     * @return displays information for all the unsolded items under the specific event
     */
    @Security.Authenticated(Secured.class)
    public Result searchUnsoldedItem(final String id) {
        Form<ItemID> userForm = Form.form(ItemID.class);

        List<Item> items = Item.findSaleEvent(id);
        List<Item> unSoldedItems = new ArrayList<Item>();
        for (Item item:items) {
            if (item.getQuantity() > 0) {
                unSoldedItems.add(item);
            }
        }
        SaleEvent sale = SaleEvent.findSale(id);
        //return ok(toJson(items));
        return ok(searchUnsoldedItem.render(
                userForm, unSoldedItems, User.finduser(request().username()), sale));
    }
    //----------------------------------------------------------

    //--------------------search unique item--------------------

    /**
     * Unique item form class.
     */
    @Security.Authenticated(Secured.class)
    public static class uniqueItem {
        /**
         * Integer itemId of item.
         */
        public Integer itemId;
        /**
         * String itemName name of item.
         */
        public String itemName;
    }

    /**
     * Search the specific items under the specific event.
     * @param id the id of a particular SaleEvent
     * @return displays information for searching specific item
     */
    @Security.Authenticated(Secured.class)
    public Result searchUniqueItem(final String id) {
        Form<uniqueItem> userForm = Form.form(uniqueItem.class);
        SaleEvent sale = SaleEvent.findSale(id);
        return ok(searchUniqueItem.render(
                userForm, User.finduser(request().username()), sale));
    }
    @Security.Authenticated(Secured.class)
    /**
     * Post method for the search the specific items
     * @param id id of unique item
     * @return redirects to print item page
     */
    public Result postsearchUniqueItem(final String id) {

        Form<uniqueItem> userForm = Form.form(
                uniqueItem.class).bindFromRequest();
        //************************************
        //int itemid =  userForm.get().itemid;
        String findname = userForm.get().itemName;

        return redirect(
                routes.ItemController.printUniqueItem(findname, id));
    }
    /**
     * Print the specific items under the specific event.
     * @param id the id of a particular SaleEvent
     * @param itemName the name of a particular item
     * @return render the page about the item information
     */
    @Security.Authenticated(Secured.class)
    public Result printUniqueItem(final String itemName, final String id) {

        Form<ItemID> userForms = Form.form(ItemID.class);

        List<Item> items = Item.findUniqueItem(id, itemName);
        SaleEvent sale = SaleEvent.findSale(id);
        return ok(searchitem.render(
                userForms, items, User.finduser(request().username()), sale));
    }
    /**
     * Post method for printing the specific items
     * @return redirects to event page or update page
     */
    @Security.Authenticated(Secured.class)
    public Result postprintUniqueItem() {

        Form<ItemID> userForm = Form.form(ItemID.class).bindFromRequest();
        Item item = Item.finditem(userForm.get().id);
        String saleID = item.getSaleEventID();
        int itemId = userForm.get().id;

        DynamicForm requestData = Form.form().bindFromRequest();
        if (requestData.get("Delete") != null) {
            item.delete();
        } else if (requestData.get("Update") != null) {
            Form<updateItemForm> updateForm = Form.form(updateItemForm.class);
            return redirect(
                    routes.ItemController.updateItem(itemId));
        }
        return redirect(
             routes.SaleController.saleInfo(saleID));
    }
    //---------------------------------------------

    //-----------------------------------------------------------
    @Security.Authenticated(Secured.class)
    public static class updateItemForm {

        /**
         * Integer id of item.
         */
        public Integer id;
        /**
         * String name of item.
         */
        public String name;
        /**
         * String price of item.
         */
        public String price;
        /**
         * String location of item.
         */
        public String location;
        /**
         * String description of item.
         */
        public String description;
        /**
         * int quantity of item to stock.
         */
        public int quantity;
    }
    //-----------------------update items-----------------------
    /**
     * Rend the item update page.
     * @param id the id of a particular SaleEvent
     * @return render the page about the item information update
     */
    @Security.Authenticated(Secured.class)
    public Result updateItem(final int id) {

        Integer newid = id;
        Item item = Item.finditem(id);
        Form<updateItemForm> userForm = Form.form(updateItemForm.class);
        return ok(updateitem.render(
                userForm, newid, User.finduser(
                        request().username()), item.getSaleEventID()));
    }

    /**
     * Post method for updating the items.
     * @return redirects to event page
     */
    @Security.Authenticated(Secured.class)
    public Result postupdateItem() {

        Form<updateItemForm> userForm =
                Form.form(updateItemForm.class).bindFromRequest();
        System.out.println(userForm.get().id);
        Item item = Item.finditem(userForm.get().id);
        String saleID = item.getSaleEventID();
        item.setName(userForm.get().name.length() > 0
                ? userForm.get().name : item.getName());
        item.setPrice(userForm.get().price.length() > 0
                ? userForm.get().price : item.getPrice());
        item.setLocation(userForm.get().location.length() > 0
                ? userForm.get().location : item.getLocation());
        item.setDescription(userForm.get().description.length() > 0
                ? userForm.get().description : item.getDescription());
        item.setQuantity(userForm.get().quantity >= 0
                ? userForm.get().quantity : item.getQuantity());
        item.save();
        return redirect(
                routes.ItemController.searchItem(saleID));
    }
    //----------------------------------------------------------


    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    /**
     * Uploads, saves, resizes image
     * @param itemID
     * @return POST image
     */
    @Security.Authenticated(Secured.class)
    public Result uploadImage(Integer itemID) {
        Item i = Item.finditem(itemID);
        Form<ItemID> userForm = Form.form(ItemID.class);
        SaleEvent sale = SaleEvent.findSale(i.getSaleEventID());
        MultipartFormData body = request().body().asMultipartFormData();
        FilePart picture = body.getFile("picture");
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = (File)picture.getFile();
            file.renameTo(new File("public/images/" + fileName));
            BufferedImage bimg = null;
            try {
                bimg = ImageIO.read(new File("public/images/" + fileName));
                java.awt.Image img = bimg.getScaledInstance(200, 150, java.awt.Image.SCALE_DEFAULT);
                BufferedImage bimg2 = new BufferedImage(200, 150, BufferedImage.TYPE_INT_RGB);
                bimg2.getGraphics().drawImage(img, 0, 0, null);
                ImageIO.write(bimg2, "PNG", new FileOutputStream("public/images/" + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            i.setPhoto(fileName);
            i.save();
            List<Item> items = Item.findSaleEvent(i.getSaleEventID());
            return ok(searchitem.render(userForm, items, User.finduser(request().username()), sale));
        } else {
            return badRequest("not a valid file");
        }
    }

    /**
     * Retrieves item specific photo
     * @param itemID id of item
     * @return posts photo
     */
    @Security.Authenticated(Secured.class)
    public Result getImage(Integer itemID) {
        Item i = Item.finditem(itemID);
        return ok(new File("public/images/"+i.getPhoto()));
    }

    /**
     * Prints tags for all items
     * @param saleEventID
     * @return PDF of tags
     */
    @Security.Authenticated(Secured.class)
    public Result printTags(String saleEventID) {
        SaleEvent sale = SaleEvent.findSale(saleEventID);
        Document pdf = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            PdfWriter writer = PdfWriter.getInstance(pdf, new FileOutputStream(sale.getName() + "_item_tags.pdf"));
            List<Item> items = Item.findSaleEvent(saleEventID);
            pdf.open();
            Anchor a1 = new Anchor("");
            a1.setName("BackToTop");
            Paragraph paragraph = new Paragraph();
            paragraph.setSpacingBefore(50);
            paragraph.add(a1);
            pdf.add(paragraph);
            int i = 0;
            items.sort((i1, i2) -> i1.getName().compareTo(i2.getName()));
            for (Item item : items) {
                Paragraph title1 = new Paragraph(item.getName(),
                        FontFactory.getFont(FontFactory.HELVETICA,
                                16,
                                Font.BOLD,
                                CMYKColor.BLACK));
                pdf.add(title1);
                String t = "";
                t += String.format("%-30s %s\n","Price: ","$" + item.getPrice());
                t += String.format("%-30s %s\n","Stock #: ",item.getId());
                t += String.format("%-30s %s\n","Quantity: ",item.getQuantity());
                t += String.format("%-30s %s\n","Description: ",item.getDescription());
                t += String.format("%-30s %s\n","Sold by: ",item.getSellername());
                Paragraph p1 = new Paragraph(t);
                pdf.add(p1);
                String barcode = Integer.toString(item.getId());
                BarcodeQRCode qr = new BarcodeQRCode(barcode.trim(), 1, 1, null);
                Image qrImg = qr.getImage();
                pdf.add(qrImg);
                if (item.getPhoto() != null && item.getPhoto().length() > 0) {
                    Image imgToAdd = Image.getInstance("public/images/"+item.getPhoto());
                    imgToAdd.scaleAbsolute(200, 150);
                    pdf.add(imgToAdd);
                }
                Paragraph p2 = new Paragraph("\n\n");
                pdf.add(p2);
                i++;
                if (i % 2 == 0) {
                    pdf.newPage();
                }
            }
            pdf.close();
            return ok(new File(sale.getName() + "_item_tags.pdf"));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ok(saleInfo.render(sale));
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //*******************************************************************
}
