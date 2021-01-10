package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient {
	
	private String name;
	private double amount;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
