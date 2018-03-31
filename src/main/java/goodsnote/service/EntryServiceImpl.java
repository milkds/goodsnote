package goodsnote.service;

import goodsnote.dao.EntryDao;
import goodsnote.model.Item;
import goodsnote.model.UserSpecificEntry;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * EntryService interface implementation.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Service
public class EntryServiceImpl implements EntryService {

    private EntryDao entryDao;
    @Override
    public void addEntry(UserSpecificEntry entry) {

    }

    @Transactional
    public void updateEntry(UserSpecificEntry entry) {
         entryDao.updateEntry(entry);
    }

    @Override
    public void removeEntry(int id) {

    }

    @Transactional
    public UserSpecificEntry getEntryById(int id) {
        return entryDao.getEntryById(id);
    }

    @Transactional
    public List<UserSpecificEntry> listEntries(int itemID) {
        return entryDao.listEntries(itemID);
    }

    public void setEntryDao(EntryDao entryDao) {
        this.entryDao = entryDao;
    }
}
