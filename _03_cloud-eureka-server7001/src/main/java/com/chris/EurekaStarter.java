package com.chris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaStarter {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStarter.class,args);
    }
}
