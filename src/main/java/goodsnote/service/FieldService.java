package goodsnote.service;


import goodsnote.model.UserSpecificField;

import java.util.List;

/**
 * Service class interface for UserSpecificFields
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
public interface FieldService {
    void addField(UserSpecificField field);
    void updateField(UserSpecificField field);
    void removeField(int id);
    UserSpecificField getFieldById(int id);
    List<UserSpecificField> listFields(int templateID);
}
