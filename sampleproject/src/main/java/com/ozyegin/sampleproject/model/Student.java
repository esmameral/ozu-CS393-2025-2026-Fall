package com.ozyegin.sampleproject.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
//@Table(name = "TSTUDENT")
public class Student extends Person{
	
	@Column(name = "PROGRAM",length = 100)
	private String department;
	
	@OneToOne
	@JoinColumn(name = "TRANSCRIPT_ID")
	private Transcript transcript;
	
	@ManyToMany(mappedBy ="students" )
	private List<Course> courses = new ArrayList<>();

	public Student(int id, String name) {
		setId(id);
		setName(name);
	}

	public void enrollCourse(Course c) {
		getCourses().add(c);
	}
	

	public Student() {
		super();

	}

	public Student(String name, String department) {
		super();
		setName(name);
		this.department = department;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [id=" + getId() + ", name=" + getName() + ", department=" + department + "]";
	}

}
