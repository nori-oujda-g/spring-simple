package com.mar.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("title", "MY BACKEND");
        model.addAttribute("async", LocalTime.now());
        return "home";
    }
}
