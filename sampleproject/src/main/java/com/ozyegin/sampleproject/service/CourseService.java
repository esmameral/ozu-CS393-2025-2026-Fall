package com.ozyegin.sampleproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ozyegin.sampleproject.dao.CourseDAO;
import com.ozyegin.sampleproject.dao.StudentDAO;

@Service
public class CourseService {
	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	CourseDAO courseDAO;
	
	@Transactional
	public void enrollStudent(int studentId,int courseId) {
		studentDAO.enrollStudent(studentId, courseId);
		courseDAO.updateQuota(courseId);	
	}
	

}


