package com.ming.ch31eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch31EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch31EurekaServerApplication.class, args);
    }
}
