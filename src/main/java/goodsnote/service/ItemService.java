package goodsnote.service;

import goodsnote.model.GoodsTemplate;
import goodsnote.model.Item;

import java.util.List;

/**
 * Service class interface for Items
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
public interface ItemService {
    void addItem(Item item);
    void updateItem(Item item);
    void removeItem(int id);
    Item getItemById(int id);
    List<Item> listItems();
}
