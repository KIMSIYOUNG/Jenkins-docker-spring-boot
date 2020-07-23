package com.example.jenkinsexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerSampleController {

    @Value("${sample.value}")
    private String sample;

    @GetMapping("/sample")
    public String getSample() {
        return sample;
    }
}
