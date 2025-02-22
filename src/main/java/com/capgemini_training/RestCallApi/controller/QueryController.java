package com.capgemini_training.RestCallApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QueryController{
    @GetMapping("/query")
    public String hello(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz";
    }
}
