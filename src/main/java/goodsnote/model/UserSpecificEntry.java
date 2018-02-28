package goodsnote.model;

import javax.persistence.*;

/**
 *This is a bean class representing entry.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Entity
@Table(name = "entries")
public class UserSpecificEntry {

    @Id
    @Column(name = "ENTRY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ENTRY_DATA")
    private String data;

    @Column(name = "ITEM_ID")
    private int itemID;

    @Column(name = "TEMPLATE_ID")
    private int templateID;

}
