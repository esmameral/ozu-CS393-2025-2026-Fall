package com.ozyegin.sampleproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ozyegin.sampleproject.model.Student;

@SpringBootTest
class SampleprojectApplicationTests {

	@Test
	void contextLoads() {
		Student firstStudent=new Student(123,"Kerem");
		//firstStudent.getId()==123;
		
	}

}
