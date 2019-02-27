package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/")
    public String calculate(@RequestParam(defaultValue = "0") int valueA,
                            @RequestParam(defaultValue = "0") int valueB) {
        int result = valueA + valueB;
        System.out.printf("%d + %d = %d\n", valueA, valueB, result);
        System.out.println(LocalDateTime.now());
        return "home";
    }
}