package com.springcore.javaconfigbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean
	public Student getStudent() {		//the method name here becomes bean name
		Student student = new Student(getAddress());
		return student;
	}

}
