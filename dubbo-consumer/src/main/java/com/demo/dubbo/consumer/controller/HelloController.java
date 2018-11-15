package com.demo.dubbo.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.api.service.HelloService;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Reference(version = "0.0.1")
    private HelloService helloService;

    @GetMapping
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHelloTo(name);
    }

}
