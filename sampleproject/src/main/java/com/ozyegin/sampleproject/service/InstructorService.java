package com.ozyegin.sampleproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozyegin.sampleproject.repo.InstructorRepository;

@Service
public class InstructorService {

	@Autowired
	InstructorRepository repo;
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
