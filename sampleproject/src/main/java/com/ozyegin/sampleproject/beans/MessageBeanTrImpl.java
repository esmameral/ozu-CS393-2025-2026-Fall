package com.ozyegin.sampleproject.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("messageBeanTr")
@Primary
public class MessageBeanTrImpl implements MessageBean {

	@Override
	public String getHelloMessage() {
		
		return "Merhaba, Hoşgeldiniz!";
	}

}
