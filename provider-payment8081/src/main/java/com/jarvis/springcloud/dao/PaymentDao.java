package com.jarvis.springcloud.dao;

import com.jarvis.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
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
