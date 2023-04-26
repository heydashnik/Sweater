package com.example.Sweater;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
        @RequestPart(name="name", required = false) String name, Model model)
    {

        model.addAttribute("name", name);
        return "getting";
    }
}
