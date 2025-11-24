package com.ozyegin.sampleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ozyegin.sampleproject.dto.StudentDTO;
import com.ozyegin.sampleproject.dto.StudentInfo;
import com.ozyegin.sampleproject.dto.StudentResponseDTO;
import com.ozyegin.sampleproject.mapper.StudentMapper;
import com.ozyegin.sampleproject.model.Student;
import com.ozyegin.sampleproject.service.StudentService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value="/students")
public class StudentController {
	@Autowired
	StudentService studentService;

	//@RequestMapping(value="/studentsnames", method=RequestMethod.GET) 
	@GetMapping(value="/names")
	public  List<String> getAllStudentNames(){
		return studentService.getNamesOnly();
		
	}
	
	@RequestMapping(method=RequestMethod.GET) 
	public  List<StudentInfo> getAllStudents(){
		return studentService.getStudents();
		
	}
	
	@RequestMapping(value="/{studentId}", method=RequestMethod.GET) 
	public  StudentInfo getAllStudentById(@PathVariable("studentId") int id,
			HttpServletResponse response){
		StudentInfo s=studentService.getStudentById(id);
		if(s==null) {
			response.setStatus(HttpStatus.NOT_FOUND.value());
		}else {
			response.setStatus(HttpStatus.FOUND.value());
		}
		
		return s;
		
	}
	
	@PostMapping
	public StudentResponseDTO saveStudent(@RequestBody StudentDTO dto) {
		Student student=StudentMapper.toStudent(dto);
		 studentService.save(student);
		 return StudentMapper.toDto(student);
		
	}
}
