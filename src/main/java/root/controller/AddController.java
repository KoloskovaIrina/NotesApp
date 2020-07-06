package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import root.repository.ListRepository;
import root.entity.ListE;

public class AddController {
    @Autowired
    private ListRepository listRepository;

    @RequestMapping(value="/addList", method= RequestMethod.GET)
    public String listForm(Model model) {
        model.addAttribute("addList", new ListE());
        return "addList";
    }

    @RequestMapping(value="/addList", method=RequestMethod.POST)
    public String listSubmit(@ModelAttribute ListE addList, Model model) {
        if (StringUtils.hasText(addList.getName())){
            listRepository.save(new ListE(addList.getName()));
        }
        return "redirect:/list";
    }

}


