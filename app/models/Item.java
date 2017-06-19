package models;

import com.avaje.ebean.Model;

import javax.persistence.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Item extends Model {
    /**
     * id of Item
     */
    @Id
    private Integer id;

    /**
     * String SaleEventID id of SaleEvent
     * associated with item.
     */
    private String saleEventID;

    /**
     * String sellerName name of the seller.
     */
    private String sellerName;

    /**
     * String itemName name of the item.
     */
    private String itemName;

    /**
     * String price of the item.
     */
    private String price;

    private String minimumPrice;
    /**
     * String location of item.
     */
    private String location;
    /**
     * String description of item.
     */
    private String description;
    /**
     * String transactionID id of transaction.
     */
    private String transactionID;
    /**
     * int quantity of item to stock.
     */
    private int quantity;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    private String photo;

    /**
     * Transaction associated transaction.
     */
    @OneToMany
    private Transaction transaction;

    /**
     * Constructs an item.
     * @param itemName name of the item
     * @param price price of the item
     * @param location location of item
     * @param description description of item
     * @param quantity quantity to stock
     */
    public Item(String itemName, String price, String location, String description, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.location = location;
        this.description = description;
        this.quantity = quantity;
    }

    public String getSaleEventID() {
        return saleEventID;
    }

    public void setSaleEventID(String saleEventID) {
        this.saleEventID = saleEventID;
    }

    //get id
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    //set and get sellername
    public String getSellername() {
        return sellerName;
    }
    public void setSellername(String sellername) {
        this.sellerName = sellername;
    }

    //set and get price
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    //set and get location
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    //set and get description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    //play data find method for database
    public static Finder<Integer, Item> find = new Finder<Integer, Item>(
            Integer.class, Item.class
    );

    /**
     * Returns all items in existence.
     * @return List<Item> list of items
     */
    public static List<Item> findAll() {
        return find.all();
    }

    /**
     * find item with specific ID.
     * @param id of item
     * @return specific item
     */
    public static Item finditem(final Integer id) {
        return find.where().eq("id", id)
                .findUnique();
    }

    /**
     * Find item by SaleEvent ID.
     * @param id of SaleEvent
     * @return List<Item> all items for specific SaleEvent
     */
    public static List<Item> findSaleEvent(final String id) {
        return find.where().eq("saleEventID", id).findList();
    }

    /**
     * Find all items for a transaction.
     * @param id of transaction in question
     * @return List<Item> all items pertaining to a transaction
     */
    public static List<Item> findTransaction(final String id) {
        return find.where().eq("transactionID", id).findList();
    }
    public String getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(String minimumPrice) {
        this.minimumPrice = minimumPrice;
    }
    /**
     * Find's a unique item.
     * @param id of item
     * @param name of item
     * @return specific item
     */
    public static List<Item> findUniqueItem(final String id, final String name) {
        return find.where().eq("saleEventID", id).eq("itemName", name).findList();
    }
    public static Item findItemWithName(final String name, final String saleEventID) {
        return find.where().eq("itemName", name).eq("transactionID", null).eq("saleEventID", saleEventID).findList().get(0);
    }
    public static Item findItemWithTransactionIDANDID(final Integer id, final String transactionID) {
        return find.where().eq("id", id).eq("transactionID", transactionID).findUnique();
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    /**
     * Decrease quantity by some amount.
     * @param i to decrease
     */
    public void decrementQuantity(final int i) {
        this.quantity -= i;
    }
    public String getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(final String transactionID) {
        this.transactionID = transactionID;
    }
}