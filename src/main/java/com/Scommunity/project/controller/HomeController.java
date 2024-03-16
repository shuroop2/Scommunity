package com.Scommunity.project.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/index")
    public String home(Model model) {
        return "짜잔";
    }
}
