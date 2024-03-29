package com.amor.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.amor.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String mes) {
        return String.format("Hi your message is %s ,but bad request",mes);
    }
}
