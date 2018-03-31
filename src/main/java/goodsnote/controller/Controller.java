package goodsnote.controller;

        import goodsnote.model.Item;
        import goodsnote.model.UserSpecificField;
        import goodsnote.service.FieldService;
        import goodsnote.service.ItemService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

/**
 * Main controller class.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
@org.springframework.stereotype.Controller
public class Controller {

    private ItemService itemService;
    private FieldService fieldService;

    @Autowired
    @Qualifier(value = "itemService")
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    @Autowired
    @Qualifier(value = "fieldService")
    public void setFieldService(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    @RequestMapping(value = "showitem/{itemID}", method = RequestMethod.GET)
    public String showItem (Model model, @PathVariable int itemID){
        model.addAttribute("Item", itemService.getItemById(itemID));

        return "showitem";
    }

    @RequestMapping(value = "showitem/update", method = RequestMethod.POST)
    public String addItem (@ModelAttribute("item") Item item){
        this.itemService.updateItem(item);

        return "redirect:/showitem/"+item.getId();
    }

    @RequestMapping(value = "createitem/{templateID}", method = RequestMethod.GET)
    public String createItem (Model model, @PathVariable int templateID){
        List<UserSpecificField> fields = fieldService.listFields(templateID);
        Item item = new Item();
        item.setTemplateID(templateID);
        item.setFields(fields);
        itemService.addItem(item);

        System.out.println("item id is - " + item.getId());

        return "redirect:/showitem/"+item.getId();
    }

}
