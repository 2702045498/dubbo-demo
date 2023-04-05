package com.bange.bangemall.service.impl;

import com.bange.api.entity.UserAddress;
import com.bange.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.HashMap;
import java.util.Map;

@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public UserAddress getUserAddr(Integer userId) {
        Map<Integer, UserAddress> userMap = new HashMap<>();
        userMap.put(1, new UserAddress(1001, 1, "北京市"));
        userMap.put(2, new UserAddress(1002, 2, "上海市"));
        userMap.put(3, new UserAddress(1003, 3, "天津市"));
        userMap.put(4, new UserAddress(1004, 4, "重庆市"));
        userMap.put(5, new UserAddress(1005, 5, "广州市"));
        return userMap.get(userId);
    }
}
