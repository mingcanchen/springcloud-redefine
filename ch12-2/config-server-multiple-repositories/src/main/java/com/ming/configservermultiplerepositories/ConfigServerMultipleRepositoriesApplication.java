package com.ming.configservermultiplerepositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerMultipleRepositoriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMultipleRepositoriesApplication.class, args);
    }
}
