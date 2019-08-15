package com.lee.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/service/hello")
    public String hello(){
        System.out.println("服务提供者2");
        return "hello,provider02";
    }
}
