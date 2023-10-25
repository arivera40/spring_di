package com.demo.spring_di;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email sent to " + rec + "with Message=" + msg);
		return true;
	}

}
