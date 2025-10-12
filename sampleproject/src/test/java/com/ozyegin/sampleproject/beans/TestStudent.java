package com.ozyegin.sampleproject.beans;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ozyegin.sampleproject.model.Student;

class TestStudent {
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before each class execution, this will be executed");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each method, this will be executed");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Student firststudent=new Student(123,"Kerem");
		assertTrue(firststudent.getId()==123);
		assertNotNull(firststudent.getName(),"Name is null!!");
		assertTrue(firststudent.getName().equals("KEREM"),"There is a bug with name assignment!!");
	}
	
	

}
