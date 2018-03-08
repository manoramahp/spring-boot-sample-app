package com.example.springboot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    // Any object returned by RestController is converted to json ******
    @RequestMapping("/topic")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring boot", "JavaEE", 1),
                new Topic("AngularJS", "JavaScript", 2),
                new Topic("Servlets", "JavaEE", 3));
    }
}
