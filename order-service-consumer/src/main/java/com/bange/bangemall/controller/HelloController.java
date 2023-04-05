package com.bange.bangemall.controller;

import com.bange.api.entity.Order;
import com.bange.api.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    OrderService orderService;

    @RequestMapping("/hello")
    public String hello(){
        Order order = orderService.initOrder(1);
        return order.toString();
    }
}
