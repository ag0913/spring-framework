package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.selfEditor.Customer;
import org.springframework.selftag.User;
import org.springframework.service.UserService;

public class Main {
	public static void main(String[] args) {
		//
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-${USER}.xml");
//		Object userService = context.getBean(UserService.class);
//		System.out.println(userService);
//		User ag = (User) context.getBean("ylj");
//		System.out.println(ag);

		System.out.println(context.getBean(Customer.class).getAddress());
	}

}