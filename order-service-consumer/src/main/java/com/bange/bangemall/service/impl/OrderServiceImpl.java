package com.bange.bangemall.service.impl;


import com.bange.api.entity.Order;
import com.bange.api.entity.UserAddress;
import com.bange.api.service.OrderService;
import com.bange.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 1.服务提供者注册到注册中心
 * 1.1 引入dubbo依赖和zookeeper依赖
 * 1.2 配置服务提供者
 * 2.服务消费者订阅注册中心
 * 3.
 */
@DubboService
public class OrderServiceImpl implements OrderService {
    @DubboReference
    UserService userService;

    @Override
    public Order initOrder(Integer Id) {
        // 查询用户地址
        UserAddress userAddr = userService.getUserAddr(Id);
        System.out.println(userAddr);
        return new Order(Id,userAddr.getUserId(),userAddr.getAddr());
    }
}
