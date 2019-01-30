package com.ming.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider")
public interface HelloService {
    @GetMapping("/hello")
    String hello();
}
