package com.chizuko.itbo.registry.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ItboRegistryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItboRegistryEurekaApplication.class, args);
    }
}
