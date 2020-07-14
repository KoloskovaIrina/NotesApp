package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import root.entity.ListE;
import root.entity.TaskE;
import root.repository.ListRepository;
import root.repository.TaskRepository;

@Controller
public class AddListController {
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value={"/addList"}, method=RequestMethod.GET)
    public String listForm(Model model) {
        model.addAttribute("addList", new ListE());
        return "addList";
    }


    @RequestMapping(value={"/addList"}, method=RequestMethod.POST)
    public String listSubmit(@ModelAttribute ListE addList, Model model) {
        if(StringUtils.hasText(addList.getName())) {
            listRepository.save(new ListE(addList.getName()));
        }
        return "redirect:/";
    }

}

