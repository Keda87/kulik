package jpa.many2one.bothdirection;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author adiyatmubarak
 */
@Entity
public class Child implements Serializable {
    
    @Id
    private int id;
    
    private String name;
    
    @ManyToOne
    private Father father;
}
