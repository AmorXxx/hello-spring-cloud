package com.amor.hello.spring.cloud.web.admin.feign.controller;

import com.amor.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String mes){
        return adminService.sayHi(mes);
    }
}
