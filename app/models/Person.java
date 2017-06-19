package models;

/**
 * Created by ThinkPad on 2016/6/8.
 */

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person extends Model {

    @Id
    public String id;

    public String name;
}
