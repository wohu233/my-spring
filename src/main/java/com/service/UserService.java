package com.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @name UserService
 * @author Smiling-HuYang
 * @version 1.0
 */

//@Scope(value = "prototype")
@Service
public class UserService {

    public UserService() {
        //创建对象会调用构造方法
        //throw new RuntimeException("a bug.....");
        System.out.println("test...");
    }

    public void save(){
        System.out.println("哈哈哈");
    }
}
