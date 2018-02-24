package goodsnote.dao;

import goodsnote.model.GoodsTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Milk on 24.02.2018.
 */
@Repository
public class GoodsTemplateDaoMockImpl implements GoodsTemplateDao {
    public void addGoodsTemplate(GoodsTemplate goodsTemplate) {
        //do nothing
    }

    public void updateGoodsTemplate(GoodsTemplate goodsTemplate) {
        //do nothing
    }

    public void removeGoodsTemplate(int id) {
        //do nothing
    }

    public GoodsTemplate getGoodsTemplateById(int id) {
        GoodsTemplate template = new GoodsTemplate();
        template.setId(1);
        template.setName("jackets");
        return template;
    }

    public List<GoodsTemplate> listGoodsTemplates() {
        List<GoodsTemplate> templates = new ArrayList<>();
        templates.add(getGoodsTemplateById(1));

        return templates;
    }
}
