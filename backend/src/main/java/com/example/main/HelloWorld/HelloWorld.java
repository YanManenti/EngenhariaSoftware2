package com.example.main.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello World";
    }
}
