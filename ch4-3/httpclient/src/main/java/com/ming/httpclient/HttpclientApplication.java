package com.ming.httpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableFeignClients
public class HttpclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpclientApplication.class, args);
    }
}
