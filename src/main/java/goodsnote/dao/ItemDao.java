package goodsnote.dao;

import goodsnote.model.GoodsTemplate;
import goodsnote.model.Item;

import java.util.List;

/**
 * Item DAO Interface
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
public interface ItemDao {

    void addItem(Item item);
    void updateItem(Item item);
    void removeItem(int id);
    Item getItemById(int id);
    List<Item> listItems();
}
