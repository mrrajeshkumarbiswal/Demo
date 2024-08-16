package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping
    public String sayHello() {
        logger.info("Hello Mr.Rajesh Kumar.......");
        return "Welcome Back Sir....... !";
    }
}
