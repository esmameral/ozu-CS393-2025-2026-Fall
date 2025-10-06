package com.ozyegin.sampleproject.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("greetingService")
@Scope("prototype")
public class GreetingServiceImpl implements GreetingService {
	
	@Autowired
	private SimpleDateFormat df;
	
	@Autowired 
	@Qualifier("messageBeanEn")
	private MessageBean messageBean;
	
	
	public MessageBean getMessageBean() {
		return messageBean;
	}

	
	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}

	private int randomNumber=(int)(Math.random()*100);

	@Override
	public String sayHello() {
		return messageBean.getHelloMessage()+" "+df.format(new Date());
	}

	@Override
	public int getRandomNumber() {
		return randomNumber;
	}

}
