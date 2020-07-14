package root.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import root.entity.ListE;
import root.repository.ListRepository;

import java.util.Optional;


@Controller
public class UpdateController {
    @Autowired
    private ListRepository listRepository;

    @GetMapping(value={"/list/{id}/updateList"})
    public String updateListForm(Model model, @PathVariable long id) {
        ListE list = listRepository.findById(id).get();
        model.addAttribute("list", list);
        return "/updateList";
    }


    @RequestMapping(value = {"/list/{id}/updateList"}, method = {RequestMethod.POST})
    public String updateListSubmit(Model model, @PathVariable long id, @ModelAttribute("list") ListE list) {
        ListE listToUpdate = listRepository.findById(id).get();
        listToUpdate.setName(list.getName());
        listRepository.save(listToUpdate);
        return "redirect:/list/" + id;
    }
}