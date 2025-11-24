package com.ozyegin.sampleproject.dto;

public class StudentDTO {
	private String program;
	private String fullName;
	private String tckn;

	public StudentDTO() {
		super();
	}

	public StudentDTO(String program, String fullName, String tckn) {
		super();
		this.program = program;
		this.fullName = fullName;
		this.tckn = tckn;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

}
