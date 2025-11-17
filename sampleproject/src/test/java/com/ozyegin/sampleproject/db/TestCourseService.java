package com.ozyegin.sampleproject.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.ozyegin.sampleproject.service.CourseService;

@SpringBootTest
class TestCourseService {
	@Autowired
	CourseService service;

	@Test
	
	void test() {
		
		service.enrollStudent(2, 3);
		
	}

}
