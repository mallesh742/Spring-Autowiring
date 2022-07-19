package com.varnaIt.autowiring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Config4.xml");

	}

}
