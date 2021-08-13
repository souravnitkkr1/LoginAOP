package com.springcore;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object obj;
		System.out.println("Enter valid username and password");
		System.out.println("Username is three character string and password is numeric");
		obj = mi.proceed();
		System.out.println("Enter site with care as everything is monitored");
		return obj;
	}
}