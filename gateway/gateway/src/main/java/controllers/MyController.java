package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("fallback/serviceA")//חשוב!! - מה שכתב ה Devops בענן ה
    public String fallbackA(){
        return "Ha Ha Ha... a is sleeping now.";
    }

    @GetMapping("fallback/serviceB")//חשוב!! - מה שכתב ה Devops בענן ה
    public String fallbackB(){
        return "Ha Ha Ha... b is sleeping now.";
    }
}
