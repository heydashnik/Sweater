package com.slodkipan.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello world";
    }
}
