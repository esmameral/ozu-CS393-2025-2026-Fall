package com.ozyegin.sampleproject.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	@Id
	private int id;
	
	private String name;
	
	private String code;
	
	private int credit;
	
	@ManyToOne
	@JoinColumn(name="INS_ID")
	private Instructor instructor;
	
	@ManyToMany //select Course as owning side
	@JoinTable(name = "REL_COURSE_STUDENT", 
	joinColumns = @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID"), 
	inverseJoinColumns=@JoinColumn(name="STUDENT_ID",referencedColumnName = "ID"))

	private List<Student> students;

	public Course() {
		super();
	}

	public Course(int id, String code, String name, int credit) {
		this.id=id;
		this.code=code;
		this.name=name;
		this.credit=credit;
	}
	public Course(String code, String name, int credit) {
		this.code=code;
		this.name=name;
		this.credit=credit;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
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

	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	 @Override
		public String toString() {
			return "Course [id=" + id + ", name=" + name + ", code=" + code + ", credit=" + credit + "]";
		}

}
