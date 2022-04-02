package com.mycompany.propertymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// access or receive request based on  url
@RestController
// request mapping can be ignored and /hello can be ignored
@RequestMapping("/api/v1/properties")
public class PropertyController {
// restful api is just a mapping of a url to a java class function
    @GetMapping("/hello")
    public String sayHello(){
        return "kshitiz, you did it !!!";
    }
}
