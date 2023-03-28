package com.chris.controller;

import com.chris.entities.CommonResult;
import com.chris.entities.Payment;
import com.chris.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/payment/create")
    public CommonResult create(Payment payment){
        int i = paymentService.create(payment);
        log.info("插入结果"+i);
        if(i>0){
            return new CommonResult(200,"创建成功");
        }
        return new CommonResult(400,"插入数据失败");

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        System.out.println(id);
        Payment paymentById = paymentService.getPaymentById(id);
        if(paymentById!=null){
            return new CommonResult(200,"success",paymentById);
        }
        return new CommonResult(404,"未找到相关记录");
    }
}
