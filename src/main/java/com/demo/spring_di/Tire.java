package com.demo.spring_di;

import org.springframework.stereotype.Component;

@Component
public class Tire {
	private String brand;

//	public Tire(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tire";
	}
	
	
}
