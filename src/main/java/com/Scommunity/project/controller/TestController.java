package com.Scommunity.project.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;

import java.security.SecureRandom;

@Controller
public class TestController {
    public void Test(Model model) {
        SecureRandom sr = new SecureRandom();
        
    }
}
