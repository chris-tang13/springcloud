package com.chris.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sentinel")
@Slf4j
public class LimitController {
    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }
    @GetMapping("/testB")
    public String testB()
    {
        log.info(Thread.currentThread().getName()+"\t"+"...testB");
        return "------testB";
    }
    @Value("${spring.cloud.sentinel.transport.port}")
    private String a;
    @GetMapping("/test")
    public String test()
    {
        return a;
    }

}
