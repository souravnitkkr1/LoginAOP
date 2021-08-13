package com.springcore;

import java.util.Scanner;

public class Login {
	public void greetCustomer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String user=sc.nextLine();
		System.out.println("Enter password");
		String pass=sc.nextLine();
		if (user.equals("AAA") && pass.equals("123") )
			System.out.println("Welcome AAA");
		else
			throw new ArithmeticException();
		
	}

	public void init() {
		System.out.println("Login Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
}