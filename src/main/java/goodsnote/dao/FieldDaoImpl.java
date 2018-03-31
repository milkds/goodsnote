package goodsnote.dao;

import goodsnote.model.UserSpecificEntry;
import goodsnote.model.UserSpecificField;
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
 * UserSpecificField DAO Interface implementation.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Repository
public class FieldDaoImpl implements FieldDao {
    private static final Logger logger = LogManager.getLogger(FieldDaoImpl.class.getName());

    private SessionFactory sessionFactory;

    @Override
    public void addField(UserSpecificField field) {

    }

    @Override
    public void updateField(UserSpecificField field) {

    }

    @Override
    public void removeField(int id) {

    }

    @Override
    public UserSpecificField getFieldById(int id) {
        return null;
    }

    @Override
    public List<UserSpecificField> listFields(int templateID) {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(UserSpecificField.class);
        criteria.add(Restrictions.like("templateID",templateID));

        return criteria.list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
