package com.ming.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chenmingcan
 */
@FeignClient(value = "discovery-springcloud-example-a")
public interface AFeign {
    @RequestMapping(path = "/invoke", method = RequestMethod.POST)
    String invoke(@RequestBody String value);
}