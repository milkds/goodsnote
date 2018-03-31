package goodsnote.service;

import goodsnote.model.Item;
import goodsnote.model.UserSpecificEntry;

import java.util.List;

/**
 * Service class interface for UserSpecificEntries
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
public interface EntryService {
    void addEntry(UserSpecificEntry entry);
    void updateEntry(UserSpecificEntry entry);
    void removeEntry(int id);
    UserSpecificEntry getEntryById(int id);
    List<UserSpecificEntry> listEntries(int itemID);
}
