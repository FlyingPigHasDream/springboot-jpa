package springboot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author rainyday
 * @createTime 2018/7/2.
 */
@Entity
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String catName;

    private int catAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
