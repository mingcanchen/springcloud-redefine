package com.ming.service.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class SkySecondController {

    /**
     * 调用service-b
     * @param serviceName 传递过去的是service-a
     * @return
     */
    @RequestMapping(value = "/getSendInfo", method = RequestMethod.GET)
    String getSendInfo(@RequestParam("serviceName") String serviceName){

        return  serviceName + " ----> " + "service-b";
    }
}
