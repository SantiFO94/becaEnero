package edu.es.eoi.entity;

import java.util.List;

import edu.es.eoi.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User extends Person {
	
	private String username;
	private String password;
	private String mail;	
	private Gender gender;
	private String address;
	private String phoneNumber;	
	private List<Recipe> recipes;	
	private Profile profile;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
	

}
