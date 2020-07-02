package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import root.entity.ListE;
import root.entity.TaskE;
import root.repository.ListRepository;
import root.repository.TaskRepository;
import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping(value = {"/list/{id}"}, method = RequestMethod.GET)
    public String getIndex(Model model, @PathVariable long id){
        Map <Long, TaskE> lists = getLists();

        model.addAttribute("lists", lists.values());
        model.addAttribute("currentList", lists.get(null));

        return "list";
    }

    private Map<Long, TaskE> getLists(){
        Map<Long, TaskE> result = new HashMap<>();
        Iterable<TaskE> lists = taskRepository.findAll();

        for (TaskE entity: lists){
            result.put(entity.getId(), entity);
        }
        return result;
    }
}



























