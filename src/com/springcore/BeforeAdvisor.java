package com.springcore;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.regex.*;    
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Please enter valid email address");
			String email=sc.nextLine();
			String regex = "^(.+)@(.+)$"; 
			Pattern pattern = Pattern.compile(regex);  
			Matcher matcher = pattern.matcher(email);  
			if(matcher.matches()==true)
				break;
		}
	}
}