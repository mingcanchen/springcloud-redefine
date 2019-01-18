package com.ming.gateway;

import com.ming.gateway.filter.GatewayRateLimitFilterByIp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

/**
 * @author chenmingcan
 */
@SpringBootApplication
public class Gateway1Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway1Application.class, args);
    }

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/test/rateLimit")
                        .filters(f -> f.filter(new GatewayRateLimitFilterByIp(10,1, Duration.ofSeconds(1))))
                        .uri("http://localhost:8000/hello/rateLimit")
                        .id("rateLimit_route")
                ).build();
    }
}

