package com.ming.consulconsumerribbon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用 openfeign 组件，调用远程服务
 *
 * @author chenmingcan
 */
@FeignClient("consul-provider")
public interface HelloService {
    /**
     * feign
     *
     * @param name
     * @return say name
     */
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);
}
