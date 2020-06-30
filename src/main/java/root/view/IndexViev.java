package root.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import  org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RequestMethod;
import root.repository.CategoryRepository;


@Controller
public class IndexViev {
    @Autowired
    private CategoryRepository categoryRepository;


}
