package com.ozyegin.sampleproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozyegin.sampleproject.model.Course;
import com.ozyegin.sampleproject.model.Instructor;
import com.ozyegin.sampleproject.repo.InstructorRepository;

@Service
public class InstructorService {

	@Autowired
	InstructorRepository repo;
	
	public void delete(int id) {
		Instructor ins=repo.findById(id).get();
		for (Course course : ins.getCourses()) {
			course.setInstructor(null);		
		}
		
		repo.deleteById(id);
	}
}
