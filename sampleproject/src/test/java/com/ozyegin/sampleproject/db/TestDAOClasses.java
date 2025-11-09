package com.ozyegin.sampleproject.db;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ozyegin.sampleproject.dao.CourseDAO;
import com.ozyegin.sampleproject.dao.StudentDAO;
import com.ozyegin.sampleproject.model.Course;
import com.ozyegin.sampleproject.model.Student;

@SpringBootTest
class TestDAOClasses {

	@Autowired
	StudentDAO studentDAO;
	
	@Mock
	CourseDAO courseDAO;
	
	
	

	@Test
	void test() {	
		Course course=new Course("CS393", "Backend Programming", 4);
		int id=6;
		when(courseDAO.checkQuota("CS393")).thenReturn(true);
		
		List<Student> list=studentDAO.getStudents();
		for (Student student : list) {
			System.out.println(student.getId()+" "+student.getName());
		}
		
		assertTrue(list.size()>0);
		
		Student s=new Student(id, "UGUR");
		studentDAO.saveStudent(s);
		if(courseDAO.checkQuota(course.getCode())) {
			s.enrollCourse(course);
			assertTrue(s.getCourses().size()>0);
		}
		
		
		List<Student> list1=studentDAO.getStudents();
		assertTrue(list1.size()-list.size()==1);
		
		Student snew=studentDAO.getStudent(id);
		
		assertNotNull(snew);
		assertTrue(snew.getName().trim().equals("UGUR"));
		verify(courseDAO, times(1)).checkQuota("CS393");
	}

}
