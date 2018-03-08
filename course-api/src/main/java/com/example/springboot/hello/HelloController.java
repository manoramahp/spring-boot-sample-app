package com.example.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    Controller handles the requests - request mapping
//    The web layer in spring boot application leverages spring mvc

    // Path is mapped by this annotation
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
