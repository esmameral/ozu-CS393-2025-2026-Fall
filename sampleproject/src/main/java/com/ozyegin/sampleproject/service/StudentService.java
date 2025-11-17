package com.ozyegin.sampleproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozyegin.sampleproject.dto.StudentInfo;
import com.ozyegin.sampleproject.model.Student;
import com.ozyegin.sampleproject.repo.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	
	public List<String> getNamesOnly(){
		return repository.getStudentNames();
	}
	
	public List<StudentInfo> getStudents(){
		return repository.getStudents();
	}
	
	public List<StudentInfo> getStudentById(int id){
		return repository.getStudentsById(id);
	}
	
}
