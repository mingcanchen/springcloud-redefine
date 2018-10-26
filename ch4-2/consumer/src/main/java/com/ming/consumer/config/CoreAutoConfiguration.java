package com.ming.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenmingcan
 */
@Configuration
public class CoreAutoConfiguration {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public FeignRequestInterceptor charlesRequestInterceptor() {
        return new FeignRequestInterceptor();
    }
}
