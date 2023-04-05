package com.bange;

import com.bange.api.entity.Order;
import com.bange.api.entity.UserAddress;
import com.bange.api.service.OrderService;

import com.bange.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes =ConsumerAppTest.class)
public class ConsumerAppTest {

    @DubboReference
    private OrderService orderService;
    @DubboReference
    UserService userService;

    @Test
    public void test() {
//        Order result = orderService.initOrder(1);
        UserAddress userAddr = userService.getUserAddr(1);
        System.out.println(userAddr);

    }
}
