package com.ming.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public String fallback() {
        return "Spring Cloud Gateway Fallback！";
    }

}
