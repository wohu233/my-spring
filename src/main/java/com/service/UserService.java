package com.service;

import org.springframework.stereotype.Service;

/**
 * @title: UserService
 * @Author Smiling-HuYang
 * @Version 1.0
 */
@Service
public class UserService {

    public UserService() {
        //创建对象会调用构造方法
        throw new RuntimeException("人为地制造一个异常.....");
    }

    public void save(){
        System.out.println("哈哈哈");
    }
}
