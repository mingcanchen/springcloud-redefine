package com.ming.consumer.service;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenmingcan
 */
@FeignClient(name = "ch4-2-provider")
public interface UserFeignService {

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    String helloFeign();

    /**
     *
     * feign请求结果是一个图片流，怎么接收
     * 生成图片验证码
     * @param imageKey
     * @return
     */
    @RequestMapping(value = "createImagesCode")
    Response createImageCode(@RequestParam("imageKey") String imageKey);

}
