package com.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServerApplication.class, args);
    }

}

