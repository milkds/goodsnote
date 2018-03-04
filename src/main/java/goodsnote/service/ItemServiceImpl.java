package goodsnote.service;

import goodsnote.dao.ItemDao;
import goodsnote.model.GoodsTemplate;
import goodsnote.model.Item;
import goodsnote.model.util.MeasurementUnits;
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
        itemDao.addItem(item);
    }

    @Override
    public void updateItem(Item item) {
        itemDao.updateItem(item);
    }

    @Override
    public void removeItem(int id) {

    }

    @Transactional
    public Item getItemById(int id) {
        if (id==0){
            return new Item();
        }
        Item item = itemDao.getItemById(id);
        int quantityMeasure = item.getQuantityMeasure();
        switch (quantityMeasure){
            case 0: item.setMeasurementUnit(MeasurementUnits.PCS); break;
            case 1: item.setMeasurementUnit(MeasurementUnits.KGs); break;
            case 2: item.setMeasurementUnit(MeasurementUnits.GR); break;
            case 3: item.setMeasurementUnit(MeasurementUnits.Meters); break;
            default: item.setMeasurementUnit(MeasurementUnits.PCS);
        }

        return item;
    }

    @Override
    public List<Item> listItems() {
        return null;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
