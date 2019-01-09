package com.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulSkywalkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulSkywalkingApplication.class, args);
    }

}

