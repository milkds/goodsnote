package goodsnote.service;

import goodsnote.dao.FieldDao;
import goodsnote.model.UserSpecificField;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * FieldService interface implementation.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Service
public class FieldServiceImpl implements FieldService {

    private FieldDao fieldDao;

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

    @Transactional
    public List<UserSpecificField> listFields(int templateID) {
        return fieldDao.listFields(templateID);
    }

    public void setFieldDao(FieldDao fieldDao) {
        this.fieldDao = fieldDao;
    }
}
