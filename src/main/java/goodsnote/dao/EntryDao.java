package goodsnote.dao;

import goodsnote.model.UserSpecificEntry;

import java.util.List;

/**
 * UserSpecificEntry DAO Interface
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
public interface EntryDao {
    void addEntry(UserSpecificEntry entry);
    void updateEntry(UserSpecificEntry entry);
    void removeEntry(int id);
    UserSpecificEntry getEntryById(int id);
    List<UserSpecificEntry> listEntries(int itemID);
}
