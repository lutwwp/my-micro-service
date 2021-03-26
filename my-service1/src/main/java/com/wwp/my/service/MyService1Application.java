package com.wwp.my.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyService1Application {

    public static void main(String[] args) {
        SpringApplication.run(MyService1Application.class, args);
    }

}
