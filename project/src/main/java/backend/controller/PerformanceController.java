package backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PerformanceController {
    @RequestMapping(value = "/performance", method = RequestMethod.GET)
    public String performance() {
        return "performance";
        
    }
    
    
}
