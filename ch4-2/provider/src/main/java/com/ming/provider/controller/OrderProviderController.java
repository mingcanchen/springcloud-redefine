package com.ming.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class OrderProviderController {


    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String hello() {
        return "hello,feign";
    }


}
