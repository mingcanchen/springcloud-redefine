package com.ming.provider;

import com.ming.api.HelloService;

/**
 *
 * @author caibosi
 * @date 2018-08-02
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello at " + System.currentTimeMillis();
    }
}
