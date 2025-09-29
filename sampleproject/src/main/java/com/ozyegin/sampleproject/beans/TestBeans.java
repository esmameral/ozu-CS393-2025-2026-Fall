package com.ozyegin.sampleproject.beans;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ozyegin.sampleproject.SampleprojectApplication;

public class TestBeans {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SampleprojectApplication.class);
		GreetingService srv = context.getBean("greetingService", GreetingService.class);

		System.out.println(srv.sayHello());
		System.out.println(srv.getRandomNumber());
		
		GreetingService srv2 = context.getBean("greetingService", GreetingService.class);

		System.out.println(srv2.sayHello());
		System.out.println(srv2.getRandomNumber());

	}

}
