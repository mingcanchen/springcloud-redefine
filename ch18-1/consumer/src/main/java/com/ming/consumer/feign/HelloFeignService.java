package com.ming.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: xujin
 **/
@FeignClient(name = "sc-producer")
public interface HelloFeignService {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
