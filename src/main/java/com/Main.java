package com;

import com.config.AppConfig;
import com.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @Author Smiling-HuYang
 */

public class Main {
	public static void main(String[] args) {
		BeanFactory beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = beanFactory.getBean(UserService.class);
		userService.save();
	}
}
