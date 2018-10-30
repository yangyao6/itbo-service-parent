package com.chizuko.eureka.feign.client.interfaces;

import com.chizuko.eureka.feign.client.conf.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName EurekaClientFeign
 * @Description
 * @Author yangyao
 * @Date 2018/10/30 0030 10:34
 * @Version 1.0
 **/

@Component
@FeignClient(value = "itbo-service-sys", configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/hello")   /**这里调用的是想要调用的服务接口*/
    String sayHiFromClientEureka(@RequestParam(value = "name")String name);
}
