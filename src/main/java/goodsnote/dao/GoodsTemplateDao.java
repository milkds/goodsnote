package goodsnote.dao;

import goodsnote.model.GoodsTemplate;

import java.util.List;

/**
 * GoodsTemplate DAO Interface
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
public interface GoodsTemplateDao {

    void addGoodsTemplate(GoodsTemplate goodsTemplate);
    void updateGoodsTemplate(GoodsTemplate goodsTemplate);
    void removeGoodsTemplate(int id);
    GoodsTemplate getGoodsTemplateById(int id);
    List<GoodsTemplate> listGoodsTemplates();
}
