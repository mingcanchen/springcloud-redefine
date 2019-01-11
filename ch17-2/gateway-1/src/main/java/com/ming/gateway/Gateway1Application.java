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
public class Gateway1Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway1Application.class, args);
    }

//    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        //生成比当前时间早一个小时的UTC时间
        ZonedDateTime minusTime = LocalDateTime.now().plusHours(1).atZone(ZoneId.systemDefault());
        return builder.routes()
                .route("after_route", r -> r.after(minusTime)
                        .uri("http://baidu.com"))
                .build();
    }
}

