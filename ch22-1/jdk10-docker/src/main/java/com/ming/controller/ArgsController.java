package com.ming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author caibosi
 * @date 2018-07-05
 */
@RestController
@RequestMapping("/args")
public class ArgsController {

    @GetMapping("/processors")
    public Mono<Integer> getAvailableProcessors(){
        return Mono.just(Runtime.getRuntime().availableProcessors());
    }
}
