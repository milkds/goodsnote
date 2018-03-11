package goodsnote.controller;

        import goodsnote.model.Item;
        import goodsnote.service.ItemService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

/**
 * Controller class.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
@org.springframework.stereotype.Controller
public class Controller {

    private ItemService itemService;

    @Autowired
    @Qualifier(value = "itemService")
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
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
        Item item = new Item();
        item.setTemplateID(templateID);
        itemService.addItem(item);
        model.addAttribute("Item", item);

        return "showitem";
    }

}
