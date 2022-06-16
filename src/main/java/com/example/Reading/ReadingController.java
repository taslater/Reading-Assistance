package com.example.Reading;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadingController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, friend!";
    }
}
