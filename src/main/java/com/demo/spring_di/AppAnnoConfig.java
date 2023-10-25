package com.demo.spring_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"com.demo.spring_di"})
public class AppAnnoConfig {
	
	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}
}
