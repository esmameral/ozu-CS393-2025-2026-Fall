package com.ozyegin.sampleproject.db;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ozyegin.sampleproject.model.Course;
import com.ozyegin.sampleproject.model.Instructor;
import com.ozyegin.sampleproject.model.Student;
import com.ozyegin.sampleproject.repo.CourseRepository;
import com.ozyegin.sampleproject.repo.InstructorRepository;
import com.ozyegin.sampleproject.repo.StudentRepository;

@SpringBootTest
class TestQueryMethods {
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	CourseRepository courseRepository;

	@Autowired
	InstructorRepository instructorRepository;

	@Test
	void testQueryFromMethodName() {

		List<Student> list = studentRepository.findByName("Berk");
		for (Student student : list) {
			System.out.println(student.getName());
		}

		List<Course> clist = courseRepository.findByCreditBetween(4, 5);
		for (Course course : clist) {
			System.out.println(course);
		}

		List<Course> clist2 = courseRepository.findByInstructorName("Erdem");
		for (Course course : clist2) {
			System.out.println(course);
		}

	}

	@Test
	void testQueries() {
		List<Student> list = studentRepository.getStudents("CS");
		for (Student s : list) {
			System.out.println(s);
		}

		Instructor ins = instructorRepository.findInstByCourse("CS393");
		System.out.println(ins);
		
		Instructor ins2 = instructorRepository.findByCoursesCode("CS393");
		System.out.println(ins2);
		
		

	}

}
