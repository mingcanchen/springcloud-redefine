package com.ming.okhttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableFeignClients
public class OkhttpApplication {

    public static void main(String[] args) {
        SpringApplication.run(OkhttpApplication.class, args);
    }
}
