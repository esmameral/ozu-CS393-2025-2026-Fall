package com.ozyegin.sampleproject.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
@Entity
public class Instructor extends Person{
	private String roomNumber;
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(String name, String tckn, String roomNumber) {
		super();
		setName(name);
		setTckn(tckn);
		this.roomNumber = roomNumber;
	}

	@OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
	private List<Course> courses=new ArrayList<>();

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

	@Override
	public String toString() {
		return "Instructor [roomNumber=" + roomNumber + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getTckn()=" + getTckn() + "]";
	}
	
	
	

}
