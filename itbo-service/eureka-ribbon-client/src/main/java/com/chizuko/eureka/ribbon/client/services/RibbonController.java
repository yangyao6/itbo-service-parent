package com.chizuko.eureka.ribbon.client.services;

import com.chizuko.eureka.ribbon.client.controller.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RibbonController
 * @Description TODO
 * @Author yangyao
 * @Date 2018/10/30 0030 09:22
 * @Version 1.0
 **/

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @Autowired
    private LoadBalancerClient loadBalancer;

    /**
    * Ribbon负载均衡调用
     * 调用方式：
     * 请求访问：http://peer2:8764/hi?name=hello
    * */
    @GetMapping("/hi")
    public String hi(@RequestParam(required = false,defaultValue = "hello") String name){
        return ribbonService.hi(name);
    }

    /**
     * Ribbon负载均衡调用测试
     * 调用方式：通过获取服务id
         * 请求访问：http://peer2:8764/testRibbon
     * */
    @GetMapping("/testRibbon")
    public String testRibbon(){
        ServiceInstance instance=loadBalancer.choose("itbo-service-sys");
        return instance.getHost()+":"+instance.getPort();
    }
}
