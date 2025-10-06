package com.ozyegin.sampleproject.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("messageBeanEn")
public class MessageBeanEnImpl implements MessageBean {

	@Value("${hello.message.en}")
	private  String message;
	

	@Override
	public String getHelloMessage() {
		
		return message;
	}

}
