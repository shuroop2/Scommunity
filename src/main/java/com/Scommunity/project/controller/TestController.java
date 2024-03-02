package com.Scommunity.project.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
public class TestController {
    @GetMapping("/api/connect")
    public String test() throws Exception {
        return "백엔드랑 연결성공";
    }
}
