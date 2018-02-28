package goodsnote.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *This is a bean class representing item.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
@Entity
@Table(name = "basic_fields")
public class Item {

    @Id
    @Column(name = "ITEM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ITEM_ARTICLE")
    private String article;

    @Column(name = "ITEM_NAME")
    private String name;

    @Column(name = "ITEM_CREATE_DATE")
    private Date creationDate;

    @Column(name = "ITEM_UPDATE_DATE")
    private Date updateDate;

    @Column(name = "ITEM_PRICE")
    private double price;

    @Column(name = "ITEM_QUANTITY")
    private double quantity;

    @Column(name = "ITEM_QUANTITY_MEASURE")
    private int quantityMeasure;

    @Column(name = "ITEM_DESCRIPTION")
    private String description;

    @Column(name = "ITEM_TEMPLATE_ID")
    private int templateID;

    @Transient
    private ArrayList<UserSpecificEntry> entries;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getQuantityMeasure() {
        return quantityMeasure;
    }

    public void setQuantityMeasure(int quantityMeasure) {
        this.quantityMeasure = quantityMeasure;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemplateID() {
        return templateID;
    }

    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }

    public ArrayList<UserSpecificEntry> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<UserSpecificEntry> entries) {
        this.entries = entries;
    }
}
