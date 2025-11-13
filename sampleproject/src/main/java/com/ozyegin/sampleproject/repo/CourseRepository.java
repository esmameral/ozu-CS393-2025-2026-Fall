package com.ozyegin.sampleproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ozyegin.sampleproject.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	public List<Course> findByCreditBetween(int min, int max);
	
	public List<Course> findByInstructorName(String name);
	
	
}
