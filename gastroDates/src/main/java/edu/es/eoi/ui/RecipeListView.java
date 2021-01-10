package edu.es.eoi.ui;

import java.util.List;

import edu.es.eoi.entity.Ingredient;
import edu.es.eoi.entity.Recipe;

public class RecipeListView {

	public static void printAllRecipes(List<Recipe> recipes) {
		
		for (Recipe recipe : recipes) {
			System.out.println("Receta: " + recipe.getRecipeName());
			
			for (Ingredient ingredient : recipe.getIngredients()) {
				System.out.println("nombre: " + ingredient.getName());
				
			}
		}
	}
}
