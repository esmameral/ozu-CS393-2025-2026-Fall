package com.ozyegin.sampleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozyegin.sampleproject.service.InstructorService;

@RestController
@RequestMapping("/instructors")
public class InstructorController {
	
	@Autowired
	InstructorService service;
	
	@DeleteMapping("/{id}")
	public void deleteInstructor(@PathVariable("id") int id) {
		service.delete(id);
	}

}
