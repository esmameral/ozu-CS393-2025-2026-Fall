package com.ozyegin.sampleproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ozyegin.sampleproject.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

	@Query(value="Select i from Instructor i inner join i.courses c where c.code=:courseCode")
	public Instructor findInstByCourse(@Param("courseCode") String courseCode);
	
	//These two methods are same
	public Instructor findByCoursesCode(String courseCode);
	
}
