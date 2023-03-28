package com.chris.mapper;

import com.chris.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
