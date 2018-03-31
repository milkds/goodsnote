package goodsnote.dao;

import goodsnote.model.UserSpecificField;

import java.util.List;

/**
 * UserSpecificField DAO Interface
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
public interface FieldDao {
    void addField(UserSpecificField field);
    void updateField(UserSpecificField field);
    void removeField(int id);
    UserSpecificField getFieldById(int id);
    List<UserSpecificField> listFields(int templateID);
}
