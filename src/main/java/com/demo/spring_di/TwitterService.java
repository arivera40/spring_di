package com.demo.spring_di;

import org.springframework.stereotype.Component;

@Component
public class TwitterService implements MessageService{

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message sent to " + rec + "with Message=" + msg);
		return true;
	}

}
