package com.ozyegin.sampleproject.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ozyegin.sampleproject.model.Course;
import com.ozyegin.sampleproject.model.Instructor;
import com.ozyegin.sampleproject.model.Student;
import com.ozyegin.sampleproject.repo.CourseRepository;

@SpringBootTest
class TestSaveData {

	@Autowired
	CourseRepository courseRepo;

	
	@Test
	void testSaveInitialData() {
		Instructor ins=new Instructor("Hasan","2978899881","112");
		Student student1=new Student("Demet", "CS");
		Student student2=new Student("Berk", "CE");
		Student student3=new Student("Canan", "IE");

		Course c1=new Course("CS104", "Introduction to Programming", 6,60);
		Course c2=new Course("CS202", "Database Management Systems", 6,60);
		Course c3=new Course("CS320", "Software Engineering", 6,60);
		c1.setInstructor(ins);
		c2.setInstructor(ins);
		c3.setInstructor(ins);
		ins.getCourses().add(c1);
		ins.getCourses().add(c2);
		ins.getCourses().add(c3);
		
		c1.getStudents().add(student1);
		c1.getStudents().add(student2);
		student1.getCourses().add(c1);
		student2.getCourses().add(c1);
		
		c2.getStudents().add(student3);
		student3.getCourses().add(c2);

		courseRepo.save(c1);
		courseRepo.save(c2);
		courseRepo.save(c3);
		
	}
	

	

}
