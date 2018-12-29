package com.ming.consulconsumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@RestController
@EnableFeignClients
public class ConsulConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerRibbonApplication.class, args);
    }

    @Autowired
    private HelloService helloService; // hello 服务提供方
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 创建 RestTemplate Bean,并用 @LaodBalanced 注解
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 接收前端传来的参数，使用 feign 的方式调用远程接口，并返回调用结果
     */
    @GetMapping("/hello1")
    public String hello1(String name) {
        return helloService.sayHello(name);
    }

    /**
     * 接收前端传来的参数，使用 restTemplate 的方式调用远程接口，并返回调用结果
     */
    @GetMapping("/hello2")
    public String hello2(String name) {
        return restTemplate.getForObject("http://consul-provider/sayHello?name=" + name, String.class);
    }

    @GetMapping("/actuator/health")
    public String health() {
        return "SUCCESS";
    }
}

