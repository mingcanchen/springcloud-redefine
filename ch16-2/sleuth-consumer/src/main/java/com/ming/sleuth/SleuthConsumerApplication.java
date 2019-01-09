package com.ming.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableFeignClients
public class SleuthConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthConsumerApplication.class, args);
    }

}

