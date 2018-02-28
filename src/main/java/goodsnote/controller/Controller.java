package goodsnote.controller;

        import goodsnote.service.ItemService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;

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

}
