package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import root.entity.ListE;
import root.repository.ListRepository;
import root.repository.TaskRepository;

@Controller
public class ListController {
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex(Model model){
        Iterable<ListE> lists = listRepository.findAll();

        model.addAttribute("lists",lists);

        return "index";
    }
}



























