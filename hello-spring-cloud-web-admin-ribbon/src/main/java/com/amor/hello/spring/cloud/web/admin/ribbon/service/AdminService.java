package com.amor.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String mes){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?mes=" + mes, String.class);
    }

    public String hiError(String mes){
        return String.format("hi your message is: %s but request bad!",mes);
    }
}
