package com.su.myspringcloud.producersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProducersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducersServiceApplication.class, args);
    }

}
