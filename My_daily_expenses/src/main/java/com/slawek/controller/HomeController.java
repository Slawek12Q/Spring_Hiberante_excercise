package com.slawek.controller;


import com.slawek.model.TimeData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String home(Model model){
        model.addAttribute("timeData", new TimeData());
        return "home";
    }
}
