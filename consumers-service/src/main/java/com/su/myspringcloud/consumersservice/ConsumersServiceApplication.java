package com.su.myspringcloud.consumersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConsumersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumersServiceApplication.class, args);
    }

}
