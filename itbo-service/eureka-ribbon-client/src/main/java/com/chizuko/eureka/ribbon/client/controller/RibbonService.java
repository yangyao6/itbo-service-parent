package com.chizuko.eureka.ribbon.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RibbonService
 * @Description TODO
 * @Author yangyao
 * @Date 2018/10/30 0030 09:19
 * @Version 1.0
 **/

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;
    public String hi(String name){
        return restTemplate.getForObject("http://itbo-service-sys/hello?name="+name,String.class);
    }
}
