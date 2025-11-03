package com.ozyegin.sampleproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_TRANSCRIPT")
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double average;
	
}
