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
public class AddTaskController {
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;


    @RequestMapping(value = "/addTask", method = RequestMethod.GET)
    public String taskForm(Model model) {
        model.addAttribute("addTask", new TaskE());
        return "addTask";
    }

    @RequestMapping(value = {"/addTask"}, method = RequestMethod.POST)
    public String taskSubmit(@ModelAttribute TaskE addTask, Model model){

        taskRepository.save(new TaskE(addTask.getParentId(), addTask.getTitle()));
        return "redirect:/list/" + addTask.getParentId();
    }



}

