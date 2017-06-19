package models;

import java.util.*;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import com.avaje.ebean.Model;
import javax.persistence.Id;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;

@Entity
public class User extends Model {

    /**
     * String email of user.
     */
    @Id
    public String email;

    /**
     * String name of user.
     */
    public String name;
    /**
     * String password of user.
     */
    public String password;

    /**
     * String address of user.
     */
    public String address;
    /**
     * String hobby of user.
     */
    public String hobby;
    /**
     * String job of user.
     */
    public String job;

    /**
     * boolean indicating status of account.
     */
    private boolean islocked;
    /**
     * int loginTime times logged in incorrectly.
     */
    private int loginTime;
    /**
     * String account authority.
     */
    private String authority;
    /**
     * String id of associated SaleEvents.
     */
    private String saleEventID;

    //***************Admin****************
    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<SaleEvent> adminSaleList = new ArrayList<SaleEvent>();

    public void addSaleEventList(SaleEvent event) {
        adminSaleList.add(event);
    }

    public List<SaleEvent> obtainSaleEventList() {
        return adminSaleList;
    }
    //************************************

    //*****Other role corresponding ID*****
    public void setSaleEventID(String eventID) {
        this.saleEventID = eventID;
    }

    public String getSaleEventID() {
        return saleEventID;
    }
    //************************************

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Constructor.
     * @param email of user.
     * @param name of user.
     * @param password of account.
     */
    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.authority = "Guest";
        this.islocked = false;
        this.loginTime = 1;
    }

    public Boolean getislocked() {
        return islocked;
    }

    public void setislocked(Boolean locked) {
        this.islocked = locked;
    }

    public int getloginTime() {
        return loginTime;
    }

    public void setloginTime(int time) {
        this.loginTime = time;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String role) {
        this.authority = role;
    }

    //play data find method for database
    public static Finder<String,User> find = new Finder<String,User>(
            String.class, User.class
    );

    //find the user with identified email and password
    public static User authenticate(String email, String password) {
        return find.where().eq("email", email)
                .eq("password", password).findUnique();
    }

    /**
     * Find all Users.
     * @return List<User> list of all existing users
     */
    public static List<User> findAll() {
        return find.all();
    }

    /**
     * Find user with specific email.
     * @param email of a user.
     * @return User with given email
     */
    public static User finduser(String email) {
        return find.where().eq("email", email).findUnique();
    }

    public static int authenticateLogintime(String email) {
        return find.where().eq("email", email)
                .findUnique().getloginTime();
    }
}