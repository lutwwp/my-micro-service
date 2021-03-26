package com.wwp.my.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyAuthenticationApplication.class, args);
    }

}
