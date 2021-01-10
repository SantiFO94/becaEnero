package edu.es.eoi.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chef extends Person {

	private String restaurant;	
	private String phone;
	private String mail;
	private String web;
	private List<Recipe> recipes;
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public List<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
	

}
