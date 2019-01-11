package com.ming.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author chenmingcan
 */
@SpringBootApplication
public class Gateway6Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway6Application.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("host_route", r -> r.host("**.baidu.com:8080")
                        .uri("http://jd.com"))
                .build();
    }
}

