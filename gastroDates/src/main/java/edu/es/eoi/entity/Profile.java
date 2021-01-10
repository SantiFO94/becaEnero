package edu.es.eoi.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile {
		
	private String description;
	private String photo;	
	private List<Recipe> preferedRecipes;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Recipe> getPreferedRecipes() {
		return preferedRecipes;
	}
	public void setPreferedRecipes(List<Recipe> preferedRecipes) {
		this.preferedRecipes = preferedRecipes;
	}
	
	

}
