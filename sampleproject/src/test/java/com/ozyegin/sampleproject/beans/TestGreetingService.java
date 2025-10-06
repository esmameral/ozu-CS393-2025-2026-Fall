package com.ozyegin.sampleproject.beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class TestGreetingService {
	@Autowired
	GreetingService srv;

	@Test
	void test() {
		System.out.println(srv.sayHello());
		System.out.println(srv.getRandomNumber());
	}

}
