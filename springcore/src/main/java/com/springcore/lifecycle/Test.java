package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		Samosa s1 = (Samosa) context.getBean("s1");
//		context.registerShutdownHook();
//		System.out.println(s1);
//		
//		System.out.println("**********");
//		pepsi p1 = (pepsi) context.getBean("p1");
//		System.out.println(p1);
		
		ExampleAnnotation example = (ExampleAnnotation) context.getBean("example");
		System.out.println(example);
	}

}
