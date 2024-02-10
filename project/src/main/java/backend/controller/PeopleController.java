package backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import backend.repository.PeopleRespository;

@Controller
public class PeopleController {
    private final PeopleRespository peopleRespository;  
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}
