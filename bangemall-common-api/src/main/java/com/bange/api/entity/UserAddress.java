package com.bange.api.entity;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private  Integer  id;
    private  Integer userId;
    private  String  addr;

    public UserAddress() {
    }

    public UserAddress(Integer id, Integer userId, String addr) {
        this.id = id;
        this.userId = userId;
        this.addr = addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserAddress{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", addr='").append(addr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
