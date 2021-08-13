package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Login restaurantObj = (Login) context.getBean("proxy", Login.class);
		System.out.println("LoginBean Initialised");
		((AbstractApplicationContext) context).registerShutdownHook();
		restaurantObj.greetCustomer();
	}
}