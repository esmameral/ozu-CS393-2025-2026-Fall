package com.ozyegin.sampleproject.model;

import jakarta.persistence.Entity;

@Entity
public class Manager extends Person {
	private String workingArea;
	private double salary;
	public String getWorkingArea() {
		return workingArea;
	}
	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
