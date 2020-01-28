package com.ragu.practice.spring.core;

public class Sales {

	int product_id;
	double price;
	double tax;
	double discount;
	
	@Override
	public String toString() {
		return "Sales [product_id=" + product_id + ", price=" + price + "]";
	}
	
	public Sales(int product_id, double price) {
		super();
		this.product_id = product_id;
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getProduct_id() {
		return product_id;
	}

	public double getPrice() {
		return price;
	}
}
	