package com.ozyegin.sampleproject;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public SimpleDateFormat getDateFormat() {
		SimpleDateFormat dfo = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return dfo;
	}


}
