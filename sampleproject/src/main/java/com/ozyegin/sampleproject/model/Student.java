package com.ozyegin.sampleproject.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "TSTUDENT")
public class Student  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	
	@Column(name = "PROGRAM",length = 100)
	private String department;
	
	@Transient
	private List<Course> courses = new ArrayList<>();

	public Student(int id, String name) {
		setId(id);
		setName(name);
	}

	public void enrollCourse(Course c) {
		getCourses().add(c);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
