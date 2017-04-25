package florianthieblemont.ent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GestionCoursController {
    private CoursRepository coursRepository;

    @Autowired
    public GestionCoursController(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    @RequestMapping(value = "/")
    public String index(ModelMap model) {
        List<Cours> cours = coursRepository.findAll();
        model.put("cours", cours);

        return "index";
    }
}
