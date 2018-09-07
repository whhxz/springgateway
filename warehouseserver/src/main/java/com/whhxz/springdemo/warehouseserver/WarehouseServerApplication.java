package com.whhxz.springdemo.warehouseserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WarehouseServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseServerApplication.class, args);
    }
}
