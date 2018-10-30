package com.chizuko.eureka.ribbon.client.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RibbonConfig
 * @Description
 * @Author yangyao
 * @Date 2018/10/30 0030 09:18
 * @Version 1.0
 **/

@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
