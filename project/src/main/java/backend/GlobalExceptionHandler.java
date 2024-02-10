package backend;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.slf4j.Logger;
import org.springframework.ui.Model;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e, Model model) {
    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    logger.error("An error occurred", e);

    // Add additional details to the model that can be displayed in the error view
    model.addAttribute("errorMessage", e.getMessage());

    // Return the name of the error view
    return "error";
}
}