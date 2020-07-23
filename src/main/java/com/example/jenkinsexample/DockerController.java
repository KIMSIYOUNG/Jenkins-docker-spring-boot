package com.example.jenkinsexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/")
    public String getWelcomeMessage() {
        return "Hello Docker example!";
    }
}
