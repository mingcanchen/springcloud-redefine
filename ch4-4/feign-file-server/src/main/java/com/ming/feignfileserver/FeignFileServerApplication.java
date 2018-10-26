package com.ming.feignfileserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableEurekaClient
public class FeignFileServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignFileServerApplication.class, args);
    }
}
