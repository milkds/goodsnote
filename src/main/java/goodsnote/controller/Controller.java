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
        System.out.println("item id is " + item.getId());
        System.out.println("created on " + item.getCreationDate());
        System.out.println("updated on " + item.getUpdateDate());
        if (item.getId()==0){
            this.itemService.addItem(item);
        }
        else {
            this.itemService.updateItem(item);
        }

        return "redirect:/showitem/"+item.getId();
    }

}
