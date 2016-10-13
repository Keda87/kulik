package jpa.one2one.onedirection;

import java.io.Serializable;
import javax.persistence.Id;

/**
 *
 * @author adiyatmubarak
 */
public class Desk implements Serializable {
    
    @Id
    private int id;
    private String position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
