package com.springcore.javaconfigbean;

import org.springframework.stereotype.Component;

public class Student {
	
	private Address address;

	public Student(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void study() {
		address.display();
		System.out.println("Student is reading book");
		
	}

}
