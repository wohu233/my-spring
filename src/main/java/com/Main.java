package com;

import com.config.AppConfig;
import com.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 *
 * @author Smiling-HuYang
 * @date   2023-10-18, 周三, 12:23
 */

public class Main {
	public static void main(String[] args) {
		BeanFactory beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService1 = beanFactory.getBean(UserService.class);
		UserService userService2 = beanFactory.getBean(UserService.class);
		//单例：放到缓存中 每次获取都是同一个 所以true
		//多例：没有放到缓存中 每次获取都是不同的对象 false
		userService1.save();
		System.out.println(userService1==userService2);
	}
}
