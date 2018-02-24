package goodsnote.model;

import javax.persistence.*;

/**
 *This is a bean class representing template for creating item entry.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
@Entity
@Table(name = "templates")
public class GoodsTemplate {
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

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    @Id
    @Column(name = "TEMPLATE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TEMPLATE_NAME")
    private String name;

    @Column(name = "TEMPLATE_PARENT_ID")
    private String parentID;

    @Override
    public String toString() {
        return "GoodsTemplate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentID='" + parentID + '\'' +
                '}';
    }
}
