package com.ming.ch31eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch31EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch31EurekaClientApplication.class, args);
    }
}
