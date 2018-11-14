package com.ming.ribbonloadbalancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenmingcan
 */
@RestController
public class LoadBalancerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add(Integer a, Integer b) {
        String forObject = restTemplate.getForObject("http://CLIENT-A/add?a=" + a + "&b=" + b, String.class);
        return forObject;
    }
}
