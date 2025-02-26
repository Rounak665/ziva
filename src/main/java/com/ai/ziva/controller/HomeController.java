package com.ai.ziva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/Ziva")
    public String homePage(Model model) {
        model.addAttribute("message", "Welcome to Ziva Chatbot!");
        return "index"; // Maps to index.html inside templates/
    }
    @GetMapping("/Chat")
    public String chat(Model model) {
        model.addAttribute("message", "Thanks for choosing Ziva!");
        return "chat"; // Maps to index.html inside templates/
    }
}
