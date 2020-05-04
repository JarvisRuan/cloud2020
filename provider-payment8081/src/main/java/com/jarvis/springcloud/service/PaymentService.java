package com.jarvis.springcloud.service;

import com.jarvis.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    /**
     * 新增
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Payment findById(@Param("id") Long id);
}
