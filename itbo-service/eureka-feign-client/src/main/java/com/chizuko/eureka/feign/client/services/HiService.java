package com.chizuko.eureka.feign.client.services;

import com.chizuko.eureka.feign.client.interfaces.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName HiService
 * @Description
 * @Author yangyao
 * @Date 2018/10/30 0030 10:44
 * @Version 1.0
 **/

@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
