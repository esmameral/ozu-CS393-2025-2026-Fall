package com.ozyegin.sampleproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ozyegin.sampleproject.dto.StudentInfo;
import com.ozyegin.sampleproject.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByName(String name);
	
	@Query(value = "Select s from Student s where s.department=?1")
	public List<Student> getStudents(String code);
	
	@Query(value = "Select s.name from Student s ")
	public @ResponseBody List<String> getStudentNames();
	
	@Query(value = "Select s from Student s ")
	public @ResponseBody List<StudentInfo> getStudents();
	
	@Query(value = "Select s from Student s where s.id=?1")
	public @ResponseBody List<StudentInfo> getStudentsById(int id);
	
	
	
	
}
