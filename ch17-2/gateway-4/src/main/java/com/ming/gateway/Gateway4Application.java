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
public class Gateway4Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway4Application.class, args);
    }

//    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("cookie_route", r -> r.cookie("chocolate", "ch.p")
                        .uri("http://localhost:8071/test/cookie"))
                .build();
    }

}

