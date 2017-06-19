package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

@Entity
public class SaleEvent extends Model{
    /**
     * string ID of SaleEvent.
     */
    @Id
    public String ID;
    /**
     * String userID for SaleEvent.
     */
    public String userID;

    /**
     * String name of SaleEvent.
     */
    @Constraints.Required
    public String name;

    /**
     * String address of SaleEvent.
     */
    public String address;

    /**
     * String starting date of Sale.
     */
    @Formats.DateTime(pattern = "mm/dd/yyyy")
    public String startDate;

    /**
     * String end date of sale.
     */
    @Formats.DateTime(pattern = "mm/dd/yyyy")
    public String endDate;

    /**
     * int items in sale.
     */
    public int itemCount;

    /**
     * boolean SaleEvent editable?
     */
    private boolean closed = false;

    /**
     * Construct new SaleEvent
     * @param name of SaleEvent
     */
    public SaleEvent(String name) {
        this.name = name;
        this.ID = UUID.randomUUID().toString();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public static Finder<String, SaleEvent> find = new Finder<String, SaleEvent>(
            String.class, SaleEvent.class
    );

    /**
     * Find sale by ID.
     * @param id of sale to find
     * @return specific SaleEvent.
     */
    public static SaleEvent findSale(final String id) {
        return find.where().eq("ID", id).findUnique();
    }

    /**
     * Deletes a given SaleEvent.
     * @param id
     */
    public static void deleteSale(final String id) {
        SaleEvent sale =  find.where().eq("ID", id).findUnique();
        sale.delete();
    }

    //*****************************************************************//

    /**
     * Finds all SaleEvent items.
     * @return List<SaleEvent> list containing all SaleEvents
     */
    public static List<SaleEvent> findAll() {
        return find.all();
    }

    /**
     * Finds all SaleEvents associated with a user.
     * @param name of user
     * @return List<SaleEvent> list of all SaleEvents associated with user
     */
    public static SaleEvent getUserSales(final String name){

        User user = User.finduser(name);
        //System.out.println(user.email);
        String id = user.getSaleEventID();

        return findSale(id);
        //return find.where().eq("userID",name).findList();
    }

    /**
     * Prints a financial report for SaleEvent.
     * @return file path of report
     */
    public String printFinancialReport() {
        List<Transaction> transactions = Transaction.findSaleEvent(this.ID);
        String fileName = endDate + "_" + name + "_report";
        File f = new File(fileName);
        try {
            FileWriter writer = new FileWriter(f, false);
            writer.write("Financial Report for : " + name + " for dates " + startDate+ " - " + endDate + "\n");
            System.out.println(transactions.size());
            Map<String, Double> sellers = new HashMap<String, Double>();
            for (Transaction t : transactions) {
                List<Item> saleItems = Item.findTransaction(t.getId());
                saleItems.forEach(i -> {
                    if (sellers.containsKey(i.getSellername())) {
                        sellers.put(i.getSellername(), sellers.get(i.getSellername()) + Double.parseDouble(i.getPrice()));
                    } else {
                        sellers.put(i.getSellername(), Double.parseDouble(i.getPrice()));
                    }
                });
                System.out.println(t.getTotal());
                String price = "......$" + t.getTotal();
                String line = String.format("Buyer: %s - %-30s%-40s\n", t.getUserName(), t.getDate(), price);
                writer.append(line);
            }
            double total = transactions.stream().mapToDouble(t -> t.getTotal()).sum();
            String description = "Total: ";
            String price = "......$" + total + "\n";
            String line = String.format( "%-44s%s%n", description, price);
            writer.append(line);
            for(String k : sellers.keySet()) {
                String l = String.format("Seller: %-60s, Total: $%-60s", k, Double.toString(sellers.get(k)));
                writer.append(l);
            }
            writer.close();
        } catch(Exception e) {
            e.printStackTrace(System.out);
        }
        return f.getAbsolutePath();
    }

    /**
     * Prints a financial report including unsold items and reduced price items
     * @return String file extension
     */
    public String printAlternativeFinancialReport() {
        List<Transaction> transactions = Transaction.findSaleEvent(this.ID);
        List<Item> saleItems = Item.findSaleEvent(this.ID);
        String fileName = endDate + "_" + name + "_report";
        File f = new File(fileName);
        try {
            FileWriter writer = new FileWriter(f, false);
            writer.write("Financial Report for : " + name + " for dates " + startDate+ " - " + endDate + "\n");
            System.out.println(transactions.size());
            Map<String, String> haggledItems = new HashMap<String, String>();
            for (Transaction t : transactions) {
                List<Item> transItems = Item.findTransaction(t.getId());
                transItems.forEach(i -> {
                    Item saleItem = Item.findItemWithName(i.getName(), this.ID);
                    if (i.getPrice() != saleItem.getPrice()) {
                        haggledItems.put(i.getName(), i.getPrice());
                    }
                });
            }
            double totalSold = 0.0;
            double totalLost = 0.0;
            for(String n : haggledItems.keySet()) {
                Item saleItem = Item.findItemWithName(n, this.ID);
                String line = String.format("Stock#: %-4d, Name: %-20s Sold for/Original: $%-6s/$%s\n",
                        saleItem.getId(),
                        saleItem.getName(),
                        haggledItems.get(n),
                        saleItem.getPrice());
                writer.append(line);
                totalSold += Double.parseDouble(haggledItems.get(n));
                totalLost += Double.parseDouble(saleItem.getPrice());
            }
            totalLost = totalLost - totalSold;
            String line = String.format("Total earned: $%-8s, Loss Due to Haggling: $%-8s\n\n\n",
                    Double.toString(totalSold),
                    Double.toString(totalLost));
            writer.append(line);
            String barrier = String.format("=====================================\n\n");
            writer.append(barrier);
            String unsoldHeader = String.format("Unsold Items: \n\n");
            writer.append(unsoldHeader);
            double totalUnsold = 0.0;
            int unsold = 0;
            for(Item item : saleItems) {
                if (item.getQuantity() > 0) {
                    String unsoldLine = String.format("Stock#: %-4d, Name: %-20s, Price: $%-8s\n", item.getId(),
                            item.getName(),
                            item.getPrice());
                    writer.append(unsoldLine);
                    totalUnsold += (double)item.getQuantity() * Double.parseDouble(item.getPrice());
                    unsold++;
                }
            }
            String unsoldConcLine = String.format("\nTotal Number of Items Unsold %-3d, Total Revenue Not Made: $%-8s\n",
                    unsold,
                    Double.toString(totalUnsold));
            writer.append(unsoldConcLine);
            writer.close();
        } catch(Exception e) {
            e.printStackTrace(System.out);
        }
        return f.getAbsolutePath();
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getUserID() {
        return this.userID;
    }
}

