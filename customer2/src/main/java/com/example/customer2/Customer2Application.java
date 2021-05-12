package com.example.customer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Customer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Customer2Application.class, args);
    }

}
