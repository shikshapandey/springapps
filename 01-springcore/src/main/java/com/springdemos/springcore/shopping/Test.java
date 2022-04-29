package com.springdemos.springcore.shopping;

import java.security.DomainCombiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/shopping/config.xml");
		ShoppingCart details = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(details);
	}
}