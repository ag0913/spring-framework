package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.service.UserService;

public class Main {
	public static void main(String[] args) {
		//
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-${USER}.xml");
		UserService bean = context.getBean(UserService.class);
		System.out.println(bean);
	}
}