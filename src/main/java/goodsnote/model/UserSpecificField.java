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
@Table(name = "user_fields")
public class UserSpecificField {

    @Id
    @Column(name = "FIELD_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TEMPLATE_ID")
    private int templateID;

    @Column(name = "USER_FIELD_TYPE")
    private int fieldType;

    @Column(name = "USER_FIELD_NAME")
    private String name;

    @Column(name = "USER_FIELD_ORDER")
    private int fieldOrder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemplateID() {
        return templateID;
    }

    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }

    public int getFieldType() {
        return fieldType;
    }

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(int fieldOrder) {
        this.fieldOrder = fieldOrder;
    }


    @Override
    public String toString() {
        return "UserSpecificField{" +
                "id=" + id +
                ", templateID=" + templateID +
                ", fieldType=" + fieldType +
                ", name='" + name + '\'' +
                ", fieldOrder=" + fieldOrder +
                '}';
    }

}
