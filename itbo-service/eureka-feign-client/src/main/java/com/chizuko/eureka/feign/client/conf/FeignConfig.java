package com.chizuko.eureka.feign.client.conf;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName FeignConfig
 * @Description
 * @Author yangyao
 * @Date 2018/10/30 0030 10:40
 * @Version 1.0
 **/

@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }
}
