package com.ming.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerHighAvailabilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerHighAvailabilityApplication.class, args);
    }

}

