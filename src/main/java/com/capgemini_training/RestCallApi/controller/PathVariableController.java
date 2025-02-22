package com.capgemini_training.RestCallApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class PathVariableController {
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }
}
