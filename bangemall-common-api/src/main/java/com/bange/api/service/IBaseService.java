package com.bange.api.service;


import java.util.List;

public abstract class IBaseService<T> {

    public abstract T query(T t);
    public abstract List<T> queryList(T t);
    public abstract int save(T t);
    public abstract int edit(T t);
    public abstract int remove(T t);
}
