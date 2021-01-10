package edu.es.eoi.entity;

import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recipe {

	private String recipeName;
	private String description;
	private String photo;
	private Set<Ingredient> ingredients;
	private double valoration;
	private int valorationCounter;
	private double valorationAccumulated;
	private List<String> comments;
	
	
	public Recipe(String recipeName, String description, String photo, Set<Ingredient> ingredients,
			int valorationCounter) {
		super();
		this.recipeName = recipeName;
		this.description = description;
		this.photo = photo;
		this.ingredients = ingredients;
		this.valorationCounter = 0;
	}

	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
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
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public double getValoration() {
		return valoration;
	}
	public void setValoration(double valoration) {
		this.valoration = valoration;
	}
	public int getValorationCounter() {
		return valorationCounter;
	}
	public void setValorationCounter(int valorationCounter) {
		this.valorationCounter = valorationCounter;
	}
	public double getValorationAccumulated() {
		return valorationAccumulated;
	}
	public void setValorationAccumulated(double d) {
		this.valorationAccumulated = d;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
	
	
}
