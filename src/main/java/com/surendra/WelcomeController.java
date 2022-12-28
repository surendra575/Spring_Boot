package com.surendra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String getMsg(){
        return "<html><h1 style='color:green'>Hi..Good morning...!!!</h1>" +
                "<h2 style='color:blue'>Welcome to Kubernetes</h2>" +
                "<br/><br/>" +new Date()+
                "</html>";
    }
}
