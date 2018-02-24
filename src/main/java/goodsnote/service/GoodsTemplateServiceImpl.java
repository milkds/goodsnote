package goodsnote.service;

import goodsnote.dao.GoodsTemplateDao;
import goodsnote.model.GoodsTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * GoodsTemplateService interface implementation
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */

@Service
public class GoodsTemplateServiceImpl implements GoodsTemplateService {

    private GoodsTemplateDao goodsTemplateDao;

    @Override
    public void addGoodsTemplate(GoodsTemplate goodsTemplate) {
        goodsTemplateDao.addGoodsTemplate(goodsTemplate);
    }

    @Override
    public void updateGoodsTemplate(GoodsTemplate goodsTemplate) {
        goodsTemplateDao.updateGoodsTemplate(goodsTemplate);
    }

    @Override
    public void removeGoodsTemplate(int id) {
        goodsTemplateDao.removeGoodsTemplate(id);
    }

    @Override
    public GoodsTemplate getGoodsTemplateById(int id) {
        return goodsTemplateDao.getGoodsTemplateById(id);
    }

    @Override
    public List<GoodsTemplate> listGoodsTemplates() {
        return goodsTemplateDao.listGoodsTemplates();
    }
}
