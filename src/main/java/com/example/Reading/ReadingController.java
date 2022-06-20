package com.example.Reading;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReadingController {
    @GetMapping("/hello")
    public String hello() {
        return "Last try";
    }
}
