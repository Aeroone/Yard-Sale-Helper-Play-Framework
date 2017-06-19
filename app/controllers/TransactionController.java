package controllers;

import models.Item;
import models.SaleEvent;
import models.Transaction;
import models.User;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles API requests for Transaction related events.
 */
public class TransactionController extends Controller {
    /**
     * Redirects to create transaction page.
     * @param id the id of SaleEvent in which the transaction is taking place
     * @return Create Transaction page
     */
    @Security.Authenticated(Secured.class)
    public Result createTransactionPage(final String id) {
        SaleEvent sale = SaleEvent.findSale(id);
        if (sale.isClosed()) {
            return ok(saleInfo.render(sale));
        } else {
            List<Item> items = Item.findSaleEvent(id);
            items.sort((i1, i2) -> i1.getId() - i2.getId());
            return ok(createTransactionPage.render(id, items));
        }
    }

    /**
     * Post method for create transaction.
     * @param id the id of the sale
     * @return redirects to SaleInfo page
     * for the SaleEvent for which an ID was provided
     */
    @Security.Authenticated(Secured.class)
    public Result createTransaction(final String id) {
        Map<String, Double> haggleMap = new HashMap<String, Double>();
        DynamicForm requestData = Form.form().bindFromRequest();
        User user = User.finduser(session().get("email"));
        List<Item> itemsToDisplay = Item.findSaleEvent(id);
        String transactionID;
        if (requestData.hasErrors()) {
            return badRequest(createTransactionPage.render(id, itemsToDisplay));
        } else {
            Transaction transaction = new Transaction(
                    requestData.get("userName"), requestData.get("date"));
            transactionID = transaction.getId();
            transaction.setSaleEventID(id);
            List<Item> items = new ArrayList<Item>();
            requestData.data().forEach((k, v) -> {
                if (isNumeric(k)) {
                    int itemID = Integer.parseInt(k);
                    int quantity = Integer.parseInt(v);
                    Item item = Item.finditem(itemID);
                    item.decrementQuantity(quantity);
                    item.save();
                    String price;
                    price = item.getPrice();
                    Item toAdd = new Item(item.getName(),
                            price,
                            item.getLocation(),
                            item.getDescription(),
                            quantity);
                    toAdd.setTransactionID(transaction.getId());
                    toAdd.setSellername(item.getSellername());
                    toAdd.save();
                } else if (k.contains("HAGGLE")) {
                    String haggleID = k.substring(k.indexOf(':') + 1);
                    haggleMap.put(haggleID, Double.parseDouble(v));
                }
            });
            List<Item> transItems = Item.findTransaction(transactionID);
            transItems.forEach(i -> {
                if (haggleMap.containsKey(i.getName())) {
                    i.setPrice(Double.toString(haggleMap.get(i.getName())));
                    i.save();
                }
            });
            transaction.computeTotal();
            transaction.save();
        }
        SaleEvent sale = SaleEvent.findSale(id);
        return ok(saleConfirmation.render(id, transactionID));
    }

    /**
     * Prints all transactions associated with SaleEvent.
     * @param id the id of specific SaleEvent
     * @return page showing all transactions
     */
    @Security.Authenticated(Secured.class)
    public Result listTransactions(final String id) {
        User user = User.finduser(session().get("email"));
        List<Transaction> list = Transaction.findSaleEvent(id);
        return ok(listTransactions.render(list, user, id));
    }

    /**
     * Creates a receipt txt document for a given transaction.
     * @param transactionID the ID of the transaction in question
     * @return a downloaded txt document
     */
    public Result printReceipt(final String transactionID) {
        Transaction transaction = Transaction.findUniqueTransaction(
                transactionID);
        String fileName = transaction.getDate()
                + "_" + transaction.getUserName()
                + "_receipt.txt";
        response().setContentType("application/x-download");
        response().setHeader("Content-disposition",
                "attachment; filename=" + fileName);
        return ok(new File(transaction.printReceipt()));
    }

    /**
     * Tests if a given string is numeric.
     * @param str string to test
     * @return true if numeric false otherwise
     */
    private static boolean isNumeric(final String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * Lists all transactions.
     * @param id id of SaleEvent.
     * @return list of all transactions
     */
    @Security.Authenticated(Secured.class)
    public Result bookTransactions(final String id) {
        List<Transaction> list = Transaction.findSaleEvent(id);
        return ok(listAllTransactions.render(list));
    }
}
