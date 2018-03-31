package goodsnote.controller;

import goodsnote.model.UserSpecificEntry;
import goodsnote.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Main controller class.
 *
 * @author Eugene Prohorenko
 * @version 1.0
 */
@org.springframework.stereotype.Controller
public class EntryController {

    private EntryService entryService;

    @Autowired
    @Qualifier(value = "entryService")
    public void setEntryService(EntryService entryService) {
        this.entryService = entryService;
    }

    @RequestMapping(value = "entry/{entryID}", method = RequestMethod.GET)
    public String showEntry (Model model, @PathVariable int entryID){
        model.addAttribute("Entry", entryService.getEntryById(entryID));

        return "entry";
    }

    @RequestMapping(value = "entry/update", method = RequestMethod.POST)
    public String updateEntry (@ModelAttribute("entry") UserSpecificEntry entry){
        System.out.println("we have an entry and its details are  - "+entry);
        this.entryService.updateEntry(entry);

        return "redirect:/showentries/"+entry.getItemID();
    }

    @RequestMapping(value = "showentries/{itemID}", method = RequestMethod.GET)
    public String showEntries (Model model, @PathVariable int itemID){
        model.addAttribute("listEntries", entryService.listEntries(itemID));
        model.addAttribute("modelEntry", new UserSpecificEntry());

        return "showentries";
    }
}
