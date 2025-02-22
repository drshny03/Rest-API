package com.capgemini_training.RestCallApi.controller;

//import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PutController {
    @PutMapping("/put/{firstName}")
    public String hello(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello "+firstName+" "+lastName + " from BridgeLabz";
    }
}
