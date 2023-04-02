package com.chris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentNacosStarter2 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentNacosStarter2.class,args);
    }
}
