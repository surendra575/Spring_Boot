package com.surendra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String getMsg(){
        return "Welcome to Kubernetes.....!!!!";
    }
}
