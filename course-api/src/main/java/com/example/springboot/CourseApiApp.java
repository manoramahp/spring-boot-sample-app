package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {
//        This is where we are going to bootstrap the application
//        In spring boot we do not need to create servlet as in other web application approaches
//        To define this is an Spring boot application we have to annotate this class

//        Inside this main method we need to define start this application,
//          and create a servlet container and host this app in it
        SpringApplication.run(CourseApiApp.class, args);

//        The above line performs following tasks
//        1. Setup default configuration defined in spring boot
//        2. Starts spring application context
//        3. Performs classpath scan (To find out the annotate classes, etc.)
//        4. Starts tomcat server that comes with spring boot
    }
}
