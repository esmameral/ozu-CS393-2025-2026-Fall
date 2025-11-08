package com.ozyegin.sampleproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ozyegin.sampleproject.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
