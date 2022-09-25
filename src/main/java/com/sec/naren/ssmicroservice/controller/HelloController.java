package com.sec.naren.ssmicroservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("Inside HelloController:");
        return "Hello";
    }
}
