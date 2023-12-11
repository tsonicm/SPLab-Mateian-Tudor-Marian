package sp.lab.Controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

public class MyErrorController implements ErrorController{
    
    @RequestMapping("/error")
    @ResponseBody
    String error(HttpServletRequest req) {
        return "<h1>Something went wrong!</h1>";
    }

    public String getErrorPath() {
        return "/error";
    }
}
