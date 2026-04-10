package com.chandan.jenkins.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello from Spring Boot + Thymeleaf!");
        model.addAttribute("name", "User");
        return "index";
    }
}
