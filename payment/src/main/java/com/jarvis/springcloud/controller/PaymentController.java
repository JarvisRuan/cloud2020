package com.jarvis.springcloud.controller;

import com.jarvis.springcloud.entity.CommonResult;
import com.jarvis.springcloud.entity.Payment;
import com.jarvis.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @GetMapping("/{id}")
    public CommonResult <Payment> get(@PathVariable Long id){
        Payment payment = paymentService.findById(id);
        log.info("***查询结果：" + payment);
        if (payment == null){
            return new CommonResult <>(404, "查询不到结果", null);
        }
        return new CommonResult <>(200,"查询正常",payment);
    }

    @PostMapping("")
    public CommonResult<Integer> createPayment(Payment payment){
        int result = paymentService.create(payment);
        return result > 0 ? new CommonResult <>(200, "插入成功", result) : new CommonResult <>(500, "插入失败", null);
    }
}
