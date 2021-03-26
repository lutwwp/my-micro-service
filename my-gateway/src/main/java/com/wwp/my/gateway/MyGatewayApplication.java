package com.wwp.my.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyGatewayApplication.class, args);
    }

}
