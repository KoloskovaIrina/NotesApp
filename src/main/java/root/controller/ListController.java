package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.util.StringUtils;

import root.entity.ListE;
import root.entity.TaskE;
import root.repository.ListRepository;
import root.repository.TaskRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import antlr.StringUtils.*;

@Controller
public class ListController {
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value ={"/", "/list"}, method = RequestMethod.GET)
    public String getIndex(Model model){
        Map<Long, ListE> lists = getLists();
        Iterable<TaskE> tasks = taskRepository.findAll();

        model.addAttribute("lists", lists.values());
        model.addAttribute("currentList", lists.get(null));
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @RequestMapping(value = {"/list/{id}"}, method = RequestMethod.GET)
    public String getIndex(Model model, @PathVariable long id){
        Map<Long, ListE> lists = getLists();
        Map<Long, TaskE> tasks = getTasks(id);

        model.addAttribute("lists", lists.values());
        model.addAttribute("currentList", lists.get(id));
        model.addAttribute("tasks", tasks.values());
        return "index";
    }


    private  Map<Long, ListE> getLists(){
        Map<Long, ListE> result = new HashMap<>();
        Iterable<ListE> lists = listRepository.findAll();
        result.put(null, new ListE("Все"));
        for(ListE entity: lists){
            result.put(entity.getId(), entity);
        }
        return result;
    }

    private Map<Long, TaskE> getTasks(Long id){
        Map<Long, TaskE> result = new HashMap<>();
        Iterable<TaskE> tasks = taskRepository.findAll();

        for (TaskE entity: tasks) {
            if (entity.getParentId() == id)
                result.put(entity.getId(), entity);
        }
        return result;
    }

    @RequestMapping(value = {"/list/{id}/delete"})
    public String removeList(@PathVariable Long id) {
        listRepository.deleteById(id);
        return "redirect:/list";
    }

    @RequestMapping(value = {"/task/{taskId}/delete"})
    public String removeTask(@PathVariable Long taskId) {
        TaskE task = taskRepository.findById((long)taskId);
        Long id = task.getParentId();
        taskRepository.deleteById(taskId);
        return "redirect:/list/" + id;
    }


}



























