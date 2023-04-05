package com.bange.api.service;


import com.bange.api.entity.UserAddress;

public interface UserService {
    // 获取用户地址
    UserAddress getUserAddr(Integer userId);


}
