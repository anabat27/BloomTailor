package com.bloomtailor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Bloom Tailor - Home");
        model.addAttribute("welcomeMessage", "Crafting Beautiful Garments");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About Bloom Tailor");
        model.addAttribute("aboutText", "We're a boutique tailoring service specializing in custom floral designs.");
        return "about";
    }
}