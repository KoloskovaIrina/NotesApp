package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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
import antlr.StringUtils.*;

@Controller
public class ListController {
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value ={"/", "/index"}, method = RequestMethod.GET)
    public String getIndex(Model model){
        Map<Long, ListE> lists = getLists();
        model.addAttribute("lists", lists.values());
        model.addAttribute("currentList", lists.get(null));
        return "index";
    }

    @RequestMapping(value = {"/index/{id}"}, method = RequestMethod.GET)
    public String getIndex(Model model, @PathVariable Long id){
        Map<Long, ListE> lists = getLists();

        model.addAttribute("lists", lists.values());
        model.addAttribute("currentList", lists.get(null));
        return "index";
    }

    private  Map<Long, ListE> getLists(){
        Map<Long, ListE> result = new HashMap<>();
        Iterable<ListE> lists = listRepository.findAll();
        for(ListE entity: lists){
            result.put(entity.getId(), entity);
        }
        return result;
    }
}



























