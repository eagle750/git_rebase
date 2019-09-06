package com.example.git_rebasing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApis {

    @RequestMapping("/api")
    public String test()
    {
        return "hello";
    }
}
