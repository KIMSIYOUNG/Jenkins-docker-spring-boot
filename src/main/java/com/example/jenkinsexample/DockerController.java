package com.example.jenkinsexample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/")
    public String getWelcomeMessage() {
        return "Hello Docker example!";
    }

    @PostMapping("/data")
    public ResponseEntity<MockRequest> json(@RequestBody MockRequest request) {
        return ResponseEntity.ok(request);
    }
}
