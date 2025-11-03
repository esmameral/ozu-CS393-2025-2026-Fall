package com.ozyegin.sampleproject.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
@Entity
public class Instructor extends Person{
	private String roomNumber;
	
	@OneToMany(mappedBy = "instructor")
	private List<Course> courses;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	

}
