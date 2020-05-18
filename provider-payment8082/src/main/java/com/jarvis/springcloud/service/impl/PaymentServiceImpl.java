package com.jarvis.springcloud.service.impl;

import com.jarvis.springcloud.dao.PaymentDao;
import com.jarvis.springcloud.entities.Payment;
import com.jarvis.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment findById(Long id) {
        return paymentDao.findById(id);
    }
}
