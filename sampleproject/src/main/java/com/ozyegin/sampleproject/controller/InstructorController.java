package com.ozyegin.sampleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozyegin.sampleproject.dto.InstructorDTO;
import com.ozyegin.sampleproject.service.InstructorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/instructors")
@CrossOrigin
public class InstructorController {
	
	@Autowired
	InstructorService service;
	
	@Operation(	summary = "Delete instructor by ID", 
			description = "Delete a single instructor. If there are some relations between instructor and course, the relations will be removed first")
	@ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Instructor deleted") }
	)
	
	@DeleteMapping("/{id}")
	public void deleteInstructor(
			@Parameter(description="Id of the instructor to be deleted. Cannot be empty.", required=true)
			@PathVariable("id") int id) {
		service.delete(id);
	}
	@GetMapping
	public List<InstructorDTO> getAll() {
		return service.getAll();
	}

}
