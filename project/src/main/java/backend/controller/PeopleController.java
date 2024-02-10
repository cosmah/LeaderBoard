package backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import backend.entity.People;
import backend.repository.PeopleRepository;

@Controller
public class PeopleController {
    private final PeopleRepository peopleRespository;
    
    public PeopleController(PeopleRepository peopleRespository){
        this.peopleRespository = peopleRespository;
    }

    @SuppressWarnings("null")
    @PostMapping("/index")
    public String index(People people, Model model){
        peopleRespository.save(people);
        model.addAttribute("message", "Data saved successfully");
        return "index";
    }
}