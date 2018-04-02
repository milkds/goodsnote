package goodsnote.dao;

import goodsnote.model.UserSpecificEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserSpecificEntry DAO Interface implementation.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Repository
public class EntryDaoImpl implements EntryDao{
    private static final Logger logger = LogManager.getLogger(EntryDaoImpl.class.getName());

    private SessionFactory sessionFactory;
    @Override
    public void addEntry(UserSpecificEntry entry) {

    }

    @Override
    public void updateEntry(UserSpecificEntry entry) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(entry);
        logger.info("entry updated successfully. Entry details: "+entry);
    }

    @Override
    public void removeEntry(int id) {

    }

    @Override
    public UserSpecificEntry getEntryById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        UserSpecificEntry entry = (UserSpecificEntry)session.load(UserSpecificEntry.class,  id);
        logger.info("entry loaded successfully. Entry details: "+entry);

        return entry;
    }

    @Override
    public List<UserSpecificEntry> listEntries(int itemID) {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(UserSpecificEntry.class);
        criteria.add(Restrictions.like("itemID",itemID));
        criteria.addOrder(Order.asc("fieldOrder"));
        List<UserSpecificEntry> entries = criteria.list();

        for (UserSpecificEntry specificEntry: entries){
            System.out.println("field id is "+specificEntry.getFieldID());
            System.out.println("field name is "+specificEntry.getFieldName());
        }

        return entries;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
