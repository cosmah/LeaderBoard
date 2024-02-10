package backend.controller;

import org.springframework.data.mongodb.core.messaging.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import backend.repository.Tasksrepo;

@Controller
public class TasksController {

    private final Tasksrepo tasksrepo;

    public TasksController(Tasksrepo tasksrepo){
        this.tasksrepo = tasksrepo;
    }

    
    @PostMapping(value = "/tasks")
    public String tasks(Task task, Model model){
        tasksrepo.save(task);
        model.addAttribute("message", "Data saved successfully");
        return "tasks";
    }
}
