package com.chris.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nacos-payment")
public interface FeignService {
    @RequestMapping("/payment/test")
    public String paymentResult();
}
