package com.chris.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {
    @RequestMapping("test")
    public String test(){
        return "test from nacos payment server";
    }
}
