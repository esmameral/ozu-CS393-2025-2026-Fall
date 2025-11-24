package com.ozyegin.sampleproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ozyegin.sampleproject.dto.CourseReturnDTO;
import com.ozyegin.sampleproject.model.Course;

@Mapper(componentModel = "spring")
public interface CourseMapper {

	    @Mapping(source = "name", target = "title")
	    @Mapping(source = "code", target = "courseCode")
	    @Mapping(source = "instructor.name", target = "instructor")
	    CourseReturnDTO ToDTO(Course course); 

		
		
	}
