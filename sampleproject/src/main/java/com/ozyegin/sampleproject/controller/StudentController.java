package com.ozyegin.sampleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ozyegin.sampleproject.dto.StudentInfo;
import com.ozyegin.sampleproject.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	//@RequestMapping(value="/studentsnames", method=RequestMethod.GET) 
	@GetMapping(value="/studentsnames")
	public  List<String> getAllStudentNames(){
		return studentService.getNamesOnly();
		
	}
	
	@RequestMapping(value="/students", method=RequestMethod.GET) 
	public  List<StudentInfo> getAllStudents(){
		return studentService.getStudents();
		
	}
	
	@RequestMapping(value="/students/{studentId}", method=RequestMethod.GET) 
	public  StudentInfo getAllStudentById(@PathVariable("studentId") int id){
		return studentService.getStudentById(id);
		
	}
}
