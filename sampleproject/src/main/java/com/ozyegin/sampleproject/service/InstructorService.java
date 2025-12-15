package com.ozyegin.sampleproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozyegin.sampleproject.dto.InstructorDTO;
import com.ozyegin.sampleproject.mapper.InstructorMapper;
import com.ozyegin.sampleproject.model.Course;
import com.ozyegin.sampleproject.model.Instructor;
import com.ozyegin.sampleproject.repo.InstructorRepository;

@Service
public class InstructorService {

	@Autowired
	InstructorRepository repo;
	
	@Autowired
	InstructorMapper mapper;
	
	public void delete(int id) {
		Instructor ins=repo.findById(id).get();
		for (Course course : ins.getCourses()) {
			course.setInstructor(null);		
		}
		
		repo.deleteById(id);
	}

	public List<InstructorDTO> getAll() {
		
		return mapper.toDTO(repo.findAll());
		
	}
}
