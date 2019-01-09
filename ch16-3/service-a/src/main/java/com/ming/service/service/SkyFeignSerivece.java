package com.ming.service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenmingcan
 */
@FeignClient(name = "ch16-3-service-b")
public interface SkyFeignSerivece {

    /**
     * 调用service-b
     * @param serviceName 传递过去的是service-a
     * @return
     */
    @RequestMapping(value = "/getSendInfo", method = RequestMethod.GET)
    String getSendInfo(@RequestParam("serviceName") String serviceName);
}
