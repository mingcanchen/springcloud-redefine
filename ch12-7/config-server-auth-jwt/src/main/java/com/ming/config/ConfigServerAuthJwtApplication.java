package com.ming.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerAuthJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAuthJwtApplication.class, args);
    }

}

