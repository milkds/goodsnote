package goodsnote.model;

/**
 * Created by Milk on 25.02.2018.
 */

import javax.persistence.*;

/**
 *This is a bean class representing field, used by template.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Entity
@Table(name = "fields")
public class UserSpecificField {

    @Id
    @Column(name = "FIELD_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "FIELD_NAME")
    private String name;

    @Column(name = "FIELD_TYPE")
    private String fieldType;

    @Column(name = "TEMPLATE_ID")
    private int templateID;

}
