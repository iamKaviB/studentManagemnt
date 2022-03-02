package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller

@AllArgsConstructor
public class Check{

    @GetMapping("/")
    public String test(Model model){
        model.addAttribute("pass","hi there");
        return "test.html";
    }
}
