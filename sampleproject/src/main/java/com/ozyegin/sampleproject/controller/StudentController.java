package com.ozyegin.sampleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ozyegin.sampleproject.dto.StudentDTO;
import com.ozyegin.sampleproject.dto.StudentInfo;
import com.ozyegin.sampleproject.dto.StudentResponseDTO;
import com.ozyegin.sampleproject.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
	@Autowired
	StudentService studentService;

	// @RequestMapping(value="/studentsnames", method=RequestMethod.GET)
	@GetMapping(value = "/names")
	public List<String> getAllStudentNames() {
		return studentService.getNamesOnly();

	}

	@RequestMapping(method = RequestMethod.GET)
	public List<StudentInfo> getAllStudents() {
		return studentService.getStudents();

	}

	@Operation(summary = "Find student by ID", description = "Returns a single student")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "302", description = "Student found successfully", content = @Content(schema = @Schema(implementation = StudentInfo.class))),
			@ApiResponse(responseCode = "404", description = "Student not found") })
	@RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
	public StudentInfo getAllStudentById(
			@Parameter(description = "Id of the student to be retrieved. Cannot be empty.", required = true) @PathVariable("studentId") int id,
			HttpServletResponse response) {
		StudentInfo s = studentService.getStudentById(id);
		if (s == null) {
			response.setStatus(HttpStatus.NOT_FOUND.value());
		} else {
			response.setStatus(HttpStatus.FOUND.value());
		}

		return s;

	}

	@PostMapping
	@Operation(summary = "Create a new student", description = "Save student information to the database")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Student created successfully", content = @Content(schema = @Schema(implementation = StudentResponseDTO.class))) })
	@ResponseStatus(value = HttpStatus.CREATED)
	public StudentResponseDTO saveStudent(@RequestBody StudentDTO dto) {
		return studentService.save(dto);

	}
}
