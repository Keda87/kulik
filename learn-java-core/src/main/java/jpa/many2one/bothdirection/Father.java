package jpa.many2one.bothdirection;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author adiyatmubarak
 */
@Entity
public class Father implements Serializable {
    
    @Id
    private int id;
    
    private String name;
    
    @OneToMany(mappedBy="father")
    private Set<Child> childs;

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

    public Set<Child> getChilds() {
        return childs;
    }

    public void setChilds(Set<Child> childs) {
        this.childs = childs;
    }

    
}
