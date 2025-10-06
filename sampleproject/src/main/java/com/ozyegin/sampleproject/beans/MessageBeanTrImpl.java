package com.ozyegin.sampleproject.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("messageBeanTr")
@Primary
public class MessageBeanTrImpl implements MessageBean {
	
	@Value("${hello.message.tr}")
	private String message;

	@Override
	public String getHelloMessage() {
		
		return message;
	}

}
