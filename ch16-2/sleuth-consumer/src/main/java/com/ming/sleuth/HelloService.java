package com.ming.sleuth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenmingcan
 */
@FeignClient(name = "sleuth-provider",url = "localhost:8082")
public interface HelloService {
    @RequestMapping("/sayHello")
    String sayHello(@RequestParam("name") String name);
}
