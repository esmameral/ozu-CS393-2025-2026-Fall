package com.ozyegin.sampleproject.model;

import jakarta.persistence.Entity;

@Entity
public class Manager extends Person {
	private String workingArea;
	private double salary;
	

}
