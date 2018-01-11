package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String  sayHello(){
         return  "Hello Springboot!";
    }
}
