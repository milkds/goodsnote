package goodsnote.service;

import goodsnote.dao.ItemDao;
import goodsnote.model.GoodsTemplate;
import goodsnote.model.Item;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * GoodsTemplateService interface implementation
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Service
public class ItemServiceImpl implements ItemService {

    private ItemDao itemDao;

    @Override
    public void addItem(Item item) {

    }

    @Override
    public void updateItem(Item item) {

    }

    @Override
    public void removeItem(int id) {

    }

    @Transactional
    public Item getItemById(int id) {

        return itemDao.getItemById(id);
    }

    @Override
    public List<Item> listItems() {
        return null;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
