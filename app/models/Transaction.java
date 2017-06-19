package models;

import com.avaje.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

@Entity
public class Transaction extends Model{
    /**
     * String id of transaction object.
     */
    @Id
    private String id;
    /**
     * String saleEventID id of associated event.
     */
    private String saleEventID;
    /**
     * String name of buyer.
     */
    private String userName;
    /**
     * String date of transaction.
     */
    private String date;
    /**
     * double total paid.
     */
    private double total;

    /**
     * Transaction constructor.
     * @param userName of buyer
     * @param date of sale
     */
    public Transaction(String userName, String date) {
        this.userName = userName;
        this.date = date;
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaleEventID() {
        return saleEventID;
    }

    public void setSaleEventID(String saleEventID) {
        this.saleEventID = saleEventID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static Finder<Integer, Transaction> find = new Finder<Integer, Transaction>(
            Integer.class, Transaction.class
    );

    /**
     * Prints receipt for specific transaction
     * @return User downloads receipt in txt document
     */
    public String printReceipt() {
        String fileName = date + "_" + userName + "_receipt";
        File t = new File(fileName);
        try {
            FileWriter writer = new FileWriter(t, false);
            writer.write("Sales receipt for : " + userName + " on " + date+"\n");
            List<Item> items = Item.findTransaction(this.id);
            items.forEach(i -> {
                try {
                    if (i.getQuantity() > 0) {
                        String description = i.getName()+" - " + i.getDescription();
                        String quant = "x" + i.getQuantity();
                        String price = ".....$" + Double.parseDouble(i.getPrice())*i.getQuantity() + "\n";
                        String line = String.format("%-40s %-20s %-10s\n", description, quant, price);
                        writer.append(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            double total = items.stream().mapToDouble(i ->
                    Double.parseDouble(i.getPrice()) * i.getQuantity()).sum();
            String description = "Total: ";
            String price = ".....$" + total + "\n";
            String line = String.format( "%-62s%s%n", description, price);
            writer.append(line);
            writer.close();
        } catch(Exception e) {
        }
        return t.getAbsolutePath();
    }

    /**
     * Finds all transactions
     * @return List of transactions
     */
    public static List<Transaction> findAll() {
        return find.all();
    }

    /**
     * Finds transactions specific to given SaleEvent
     * @param id the ID of the SaleEvent for which transactions are to be found
     * @return List of transactions specific to a SaleEcent
     */
    public static List<Transaction> findSaleEvent(final String id) {
        return find.where().eq("saleEventID", id).findList();
    }

    /**
     * Finds transaction with given ID
     * @param id id of transaction to find
     * @return first instance of transaction with given ID
     */
    public static Transaction findUniqueTransaction(final String id) {
        return find.where().eq("id", id).findUnique();
    }
    public static Transaction findByUsername(final String userName) {
        return find.where().eq("userName", userName).findUnique();
    }
    public void computeTotal() {
        List<Item> items = Item.findTransaction(this.id);
        double sum = 0;
        for(Item item : items) {
            if (item.getPrice().length() == 0) {
                sum += 0;
            } else {
                sum += Double.parseDouble(item.getPrice()) * item.getQuantity();
            }
        }
        this.total = sum;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

}
