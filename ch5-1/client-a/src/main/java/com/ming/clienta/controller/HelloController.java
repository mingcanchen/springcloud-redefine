package com.ming.clienta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author chenmingcan
 */
@RestController
public class HelloController {

    @GetMapping("/add")
    public String add(Integer a, Integer b, HttpServletRequest request) {
        return "From Port " + request.getServerPort() + ", Result: " + (a + b);
    }
}
