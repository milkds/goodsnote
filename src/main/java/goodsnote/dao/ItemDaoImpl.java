package goodsnote.dao;

import goodsnote.model.Item;
import goodsnote.model.UserSpecificEntry;
import goodsnote.model.UserSpecificField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Item DAO Interface implementation.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Repository
public class ItemDaoImpl implements ItemDao {
    private static final Logger logger = LogManager.getLogger(ItemDaoImpl.class.getName());
    private SessionFactory sessionFactory;

    @Override
    public void addItem(Item item) {
        Session session = this.sessionFactory.getCurrentSession();
        int id = (Integer)session.save(item);
        item.setId(id);
        List<UserSpecificField> fields = item.getFields();
        for (UserSpecificField field: fields){
            UserSpecificEntry entry = this.getEntry(field,id);
            session.persist(entry);
        }

    }

    @Override
    public void updateItem(Item item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(item);
        logger.info("item updated successfully. Manual details: "+item);
    }

    @Override
    public void removeItem(int id) {

    }

    @Override
    public Item getItemById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Item item = (Item)session.load(Item.class,  id);
        logger.info("item loaded successfully. Item details: "+item);

        return item;
    }

    @Override
    public List<Item> listItems() {
        return null;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private UserSpecificEntry getEntry(UserSpecificField field, int itemID){
        UserSpecificEntry entry = new UserSpecificEntry();
        entry.setItemID(itemID);
        entry.setFieldID(field.getId());

        return entry;
    }
}
