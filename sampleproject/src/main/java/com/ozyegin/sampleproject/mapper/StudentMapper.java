package com.ozyegin.sampleproject.mapper;

import com.ozyegin.sampleproject.dto.StudentDTO;
import com.ozyegin.sampleproject.dto.StudentResponseDTO;
import com.ozyegin.sampleproject.model.Student;

public class StudentMapper {
public static Student toStudent(StudentDTO dto) {
	Student s=new Student();
	s.setName(dto.getFullName());
	s.setTckn(dto.getTckn());
	s.setDepartment(dto.getProgram());
	return s;
	
}
public static StudentResponseDTO toDto(Student student) {
	StudentResponseDTO dto=new StudentResponseDTO(student.getId(),student.getName());
	return dto;
	
}

}
