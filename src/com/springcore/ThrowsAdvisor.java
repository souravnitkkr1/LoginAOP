package com.springcore;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("Wrong username or password");
	}
}