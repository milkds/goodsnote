package goodsnote.dao;

import goodsnote.model.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Milk on 27.02.2018.
 */
@Repository
public class ItemDaoMockImpl implements ItemDao{

    private static final Logger logger = LogManager.getLogger(ItemDaoMockImpl.class.getName());

    private SessionFactory sessionFactory;

    @Override
    public void addItem(Item item) {

    }

    @Override
    public void updateItem(Item item) {

    }

    @Override
    public void removeItem(int id) {

    }

    @Override
    public Item getItemById(int id) {
        logger.info("getting item by id omg");
        Item item = new Item();
        item.setId(100);
        item.setArticle("SKU1488");
        item.setName("Mein Kampf");
        item.setCreationDate(new Date(117,3,12));
        item.setPrice(14.88);
        item.setQuantityMeasure(1);
        item.setDescription("Best book in the world");
        return item;
    }

    @Override
    public List<Item> listItems() {
        return null;
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
