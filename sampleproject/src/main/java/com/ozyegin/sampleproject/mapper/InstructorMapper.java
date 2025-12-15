package com.ozyegin.sampleproject.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.ozyegin.sampleproject.dto.InstructorDTO;
import com.ozyegin.sampleproject.model.Instructor;

@Mapper(componentModel = "spring")
public interface InstructorMapper {

	 
	    
	    List<InstructorDTO> toDTO(List<Instructor> list); 

		
		
	}
