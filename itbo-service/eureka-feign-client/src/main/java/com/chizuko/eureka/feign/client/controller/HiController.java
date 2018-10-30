package com.chizuko.eureka.feign.client.controller;

import com.chizuko.eureka.feign.client.services.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Description
 * @Author yangyao
 * @Date 2018/10/30 0030 10:46
 * @Version 1.0
 **/

@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "hello", required = false)String name){
        return hiService.sayHi(name);
    }
}
