package goodsnote.dao;

import goodsnote.model.GoodsTemplate;
import goodsnote.model.Item;

import java.util.List;

/**
 * Created by Milk on 27.02.2018.
 */
public interface ItemDao {

    void addItem(Item item);
    void updateItem(Item item);
    void removeItem(int id);
    Item getItemById(int id);
    List<Item> listItems();
}
