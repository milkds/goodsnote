package goodsnote.model;

import javax.persistence.*;

/**
 *This is a bean class representing entry.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Entity
@Table(name = "user_entries")
@SecondaryTable(name = "user_fields", pkJoinColumns={
        @PrimaryKeyJoinColumn(name="FIELD_ID") })
public class UserSpecificEntry {

    @Id
    @Column(name = "USER_ENTRY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //TODO: make this field insertable and updatable only in table entries
    @Column(name = "USER_FIELD_ID")
    private int fieldID;

    @Column(name = "USER_FIELD_TYPE", table = "user_fields", insertable = false, updatable = false)
    private int fieldType;

    @Column(name = "USER_FIELD_NAME", table = "user_fields", insertable = false, updatable = false )
    private String fieldName;

    @Column(name = "USER_FIELD_ORDER", table = "user_fields", insertable = false, updatable = false)
    private int fieldOrder;

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

    public int getFieldType() {
        return fieldType;
    }

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(int fieldOrder) {
        this.fieldOrder = fieldOrder;
    }

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

    public int getFieldID() {
        return fieldID;
    }

    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }

    @Override
    public String toString() {
        return "UserSpecificEntry{" +
                "id=" + id +
                ", fieldID=" + fieldID +
                ", fieldType=" + fieldType +
                ", fieldName='" + fieldName + '\'' +
                ", fieldOrder=" + fieldOrder +
                ", fieldValue='" + fieldValue + '\'' +
                ", itemID=" + itemID +
                '}';
    }
}
