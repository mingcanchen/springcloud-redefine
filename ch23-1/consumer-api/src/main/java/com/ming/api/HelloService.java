package com.ming.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenmingcan
 */
@FeignClient("provider")
public interface HelloService {
    @GetMapping("/hello")
    String hello();
}
