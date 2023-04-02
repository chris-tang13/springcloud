package com.chris.controller;

import com.chris.feignservice.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private FeignService feignService;
    @RequestMapping("test")
    public String result(){
        return feignService.paymentResult();
    }
}
