package goodsnote.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *This is a bean class representing entry.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Entity
@Table(name = "user_entries")
/*@SecondaryTable(name = "user_fields", pkJoinColumns={
        @PrimaryKeyJoinColumn(name="FIELD_ID") })*/
public class UserSpecificEntry {

    @Id
    @Column(name = "USER_ENTRY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="USER_FIELD_ID",referencedColumnName="FIELD_ID"/*, updatable = false, insertable = false*/)
    private UserSpecificField field;

   /* @Column(name = "USER_FIELD_TYPE", table = "user_fields", insertable = false, updatable = false)
    private Integer fieldType;

    @Column(name = "USER_FIELD_NAME", table = "user_fields", insertable = false, updatable = false )
    private String fieldName;

    @Column(name = "USER_FIELD_ORDER", table = "user_fields", insertable = false, updatable = false)
    private Integer fieldOrder;*/

    @Column(name = "USER_ENTRY_VALUE")
    private String fieldValue;

    @Column(name = "ITEM_ID")
    private int itemID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 /*   public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(Integer fieldOrder) {
        this.fieldOrder = fieldOrder;
    }*/

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public UserSpecificField getField() {
        return field;
    }

    public void setField(UserSpecificField field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "UserSpecificEntry{" +
                "id=" + id +
                ", field=" + field +
                ", fieldValue='" + fieldValue + '\'' +
                ", itemID=" + itemID +
                '}';
    }
}
