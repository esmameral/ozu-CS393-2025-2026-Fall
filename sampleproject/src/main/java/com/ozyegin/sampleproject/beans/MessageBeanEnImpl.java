package com.ozyegin.sampleproject.beans;

import org.springframework.stereotype.Component;

@Component("messageBeanEn")
public class MessageBeanEnImpl implements MessageBean {

	@Override
	public String getHelloMessage() {
		
		return "Hello, How are you?";
	}

}
