package com.ozyegin.sampleproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ozyegin.sampleproject.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByName(String name);
	
	@Query(value = "Select s from Student s where s.department=?1")
	public List<Student> getStudents(String code);
	
}
