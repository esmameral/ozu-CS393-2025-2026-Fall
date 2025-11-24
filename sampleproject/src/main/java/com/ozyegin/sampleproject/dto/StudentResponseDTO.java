package com.ozyegin.sampleproject.dto;

public class StudentResponseDTO {
	private String fullName;
	private int id;
	
	public StudentResponseDTO() {
		super();
	}
	public StudentResponseDTO(int id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
