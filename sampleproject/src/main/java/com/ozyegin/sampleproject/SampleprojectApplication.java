package com.ozyegin.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(version = "1.0", 
title = "School Management System API", 
description = "All Administration (add/remove/update/get Operations"))
public class SampleprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleprojectApplication.class, args);
	}

}
