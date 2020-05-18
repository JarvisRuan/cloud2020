package com.jarvis.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author : jarvis
 * Date: 2020/4/29 23:48
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8081 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8081.class,args);
    }
}
