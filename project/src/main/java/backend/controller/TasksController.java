package backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TasksController {
    @RequestMapping(value = "/tasks")
    public String tasks(){
        return "tasks";
    }
}
