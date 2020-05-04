package springcloud.controller;

import com.jarvis.springcloud.entities.CommonResult;
import com.jarvis.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "http://localhost:8081/";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create (@RequestBody Payment payment){
        return restTemplate.postForObject(URL+"payment/create",payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        return restTemplate.getForObject(URL+"payment/get/"+id,CommonResult.class);
    }
}
