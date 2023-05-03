package it.develhope.Environment.Variables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String getGreetingMessage(){
        String authCode = environment.getProperty("Properties.authCode");
        String devName = environment.getProperty("Properties.devName");
        return "Hello user, your authCode is " + authCode + " and your devName is " + devName;
        }
    }



