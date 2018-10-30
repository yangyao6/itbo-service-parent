package com.chizuko.itbo.router.ruul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ItboRouterRuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItboRouterRuulApplication.class, args);
    }
}
