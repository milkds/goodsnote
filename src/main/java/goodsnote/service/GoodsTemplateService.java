package goodsnote.service;

import goodsnote.model.GoodsTemplate;

import java.util.List;

/**
 * Service class interface for GoodsTemplates
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
public interface GoodsTemplateService {

    void addGoodsTemplate(GoodsTemplate goodsTemplate);
    void updateGoodsTemplate(GoodsTemplate goodsTemplate);
    void removeGoodsTemplate(int id);
    GoodsTemplate getGoodsTemplateById(int id);
    List<GoodsTemplate> listGoodsTemplates();
}
