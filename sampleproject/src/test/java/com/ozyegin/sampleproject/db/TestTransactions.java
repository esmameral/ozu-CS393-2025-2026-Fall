package com.ozyegin.sampleproject.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ozyegin.sampleproject.dao.CourseDAO;
import com.ozyegin.sampleproject.dao.StudentDAO;

@SpringBootTest
class TestTransactions {
	@Autowired
	CourseDAO courseDAO;

	@Autowired
	StudentDAO studentDAO;

	

	@Test
	void testUpdateQuota() {
		courseDAO.updateQuota(9953);
	}

	@Test
	void testEnrollStudent() {
		studentDAO.enrollStudent(10102, 9953);
	}

}
