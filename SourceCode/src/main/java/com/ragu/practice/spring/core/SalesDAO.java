package com.ragu.practice.spring.core;

public class SalesDAO{
	
	public Sales generateTax(Sales s) {
		
		System.out.println("Generation of Bill");
		
		double tax = (int)(Math.random() * 10);
		s.setTax(tax);
		System.out.println(s.getTax());
		
		System.out.println("Generation of Discount %");
		
		double discount = (int)(Math.random() * 10);
		s.setDiscount(discount);
		System.out.println(s.getDiscount());
		return s;
	}
}
