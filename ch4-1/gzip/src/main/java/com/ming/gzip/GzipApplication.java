package com.ming.gzip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableFeignClients
public class GzipApplication {

    public static void main(String[] args) {
        SpringApplication.run(GzipApplication.class, args);
    }
}
