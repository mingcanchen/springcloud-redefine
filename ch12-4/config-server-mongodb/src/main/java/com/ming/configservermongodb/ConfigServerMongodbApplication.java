package com.ming.configservermongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.mongodb.EnableMongoConfigServer;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableMongoConfigServer
public class ConfigServerMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMongodbApplication.class, args);
    }
}
