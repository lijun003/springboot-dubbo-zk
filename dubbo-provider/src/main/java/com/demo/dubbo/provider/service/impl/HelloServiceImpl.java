package com.demo.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.api.service.HelloService;

@Service(version = "0.0.1")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHelloTo(String name) {
        return "Hello, " + name;
    }
}
