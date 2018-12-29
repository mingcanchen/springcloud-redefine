package com.ming.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@RestController
public class ConsulRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulRegisterApplication.class, args);
    }

    /**
     * 自定义监控检查接口
     *
     * @return
     */
    @GetMapping("/health")
    public String health() {
        return "SUCCESS";
    }

}

