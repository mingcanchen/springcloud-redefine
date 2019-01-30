package com.ming.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 *
 * @author caibosi
 * @date 2018-08-02
 */
@Component
public class DemoConsumer {

    @Reference
    private HelloService helloService;

    public String callHello(){
        return helloService.hello();
    }
}
