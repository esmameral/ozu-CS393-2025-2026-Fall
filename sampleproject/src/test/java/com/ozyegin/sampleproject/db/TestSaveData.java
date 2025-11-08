package com.ozyegin.sampleproject.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.ozyegin.sampleproject.model.Course;
import com.ozyegin.sampleproject.model.Instructor;
import com.ozyegin.sampleproject.model.Student;
import com.ozyegin.sampleproject.repo.CourseRepository;
import com.ozyegin.sampleproject.repo.InstructorRepository;
import com.ozyegin.sampleproject.repo.StudentRepository;

@SpringBootTest
class TestSaveData {
	@Autowired
	StudentRepository repo;
	@Autowired
	CourseRepository courseRepo;
	@Autowired
	InstructorRepository insRepo;
	
	@Test
	void testInsertNewStudent() {
		Instructor ins=new Instructor("Erdem","2978899881","240");
		Student student1=new Student("JOHN", "CS");
		Student student2=new Student("KEREM", "EE");
		Student student3=new Student("MEHMET", "IE");

		Course c1=new Course("CS391", "Web Application programming", 4);
		Course c2=new Course("CS393", "Backend programming", 4);
		Course c3=new Course("CS105", "Object Oriented Programming", 6);
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
