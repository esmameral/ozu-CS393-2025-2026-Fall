package com.ozyegin.sampleproject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ozyegin.sampleproject.dao.StudentDAO;
@Component
public class MyRunner implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {
		System.out.println("....My CommandLineRunner executed....");
		

	}

}
