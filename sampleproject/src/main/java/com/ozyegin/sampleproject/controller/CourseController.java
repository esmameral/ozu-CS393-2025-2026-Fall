package com.ozyegin.sampleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozyegin.sampleproject.dto.CourseDTO;
import com.ozyegin.sampleproject.dto.CourseReturnDTO;
import com.ozyegin.sampleproject.service.CourseService;

@RestController
@RequestMapping("/courses")
@CrossOrigin
public class CourseController {
	@Autowired
	CourseService courseService;
	
	
	@GetMapping
	public List<CourseReturnDTO> getAllCourses(){
		return courseService.getAll();
	}
	
	@PostMapping
	public void save(@RequestBody CourseDTO dto){
		courseService.save(dto);
	}

}
