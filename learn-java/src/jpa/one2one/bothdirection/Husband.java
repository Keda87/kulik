package jpa.one2one.bothdirection;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author adiyatmubarak
 */
@Entity
public class Husband implements Serializable {
    
    @Id
    private int id;
    
    private String name;
    
    @OneToOne
    private Wife wife;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
    
}
