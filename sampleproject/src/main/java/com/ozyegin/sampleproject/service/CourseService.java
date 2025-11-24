package com.ozyegin.sampleproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ozyegin.sampleproject.dao.CourseDAO;
import com.ozyegin.sampleproject.dao.StudentDAO;
import com.ozyegin.sampleproject.dto.CourseReturnDTO;
import com.ozyegin.sampleproject.mapper.CourseMapper;
import com.ozyegin.sampleproject.model.Course;
import com.ozyegin.sampleproject.repo.CourseRepository;

@Service
public class CourseService {
	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	CourseDAO courseDAO;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	CourseMapper courseMapper;
	
	@Transactional
	public void enrollStudent(int studentId,int courseId) {
		studentDAO.enrollStudent(studentId, courseId);
		courseDAO.updateQuota(courseId);	
	}
	
	public List<CourseReturnDTO> getAll(){
		
		List<Course> list= courseRepository.findAll();
		List<CourseReturnDTO> returnList= new ArrayList<>();
		for (Course course : list) {
			CourseReturnDTO dto=courseMapper.ToDTO(course);
			returnList.add(dto);
		}
		return returnList;
		
		
	}
	

}


