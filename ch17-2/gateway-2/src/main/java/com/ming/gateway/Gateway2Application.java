package com.ming.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author chenmingcan
 */
@SpringBootApplication
public class Gateway2Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway2Application.class, args);
    }

//    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {

        ZonedDateTime datetime = LocalDateTime.now().plusDays(1).atZone(ZoneId.systemDefault());
        return builder.routes()
                .route("before_route", r -> r.before(datetime)
                        .uri("http://baidu.com"))

                .build();
    }
}

