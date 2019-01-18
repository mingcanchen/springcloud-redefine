package com.ming.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RequestMapping("/hello")
@RestController
public class HelloController {


    @GetMapping("/rateLimit")
    public String hello() {
        return "Hello, spring cloud Gateway";
    }

}
