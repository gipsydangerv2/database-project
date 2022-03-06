package com.ankit.dbp.databaseproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/testApi")
    public String testMethod() {
        return "Hurray. It works !!!";
    }
}
