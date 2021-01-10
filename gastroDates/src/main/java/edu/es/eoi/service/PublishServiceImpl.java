package edu.es.eoi.service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import edu.es.eoi.entity.Ingredient;
import edu.es.eoi.entity.Recipe;

public class PublishServiceImpl implements PublishService{

	@Override
	public Recipe publishRecipe() {
		
		Scanner sctexto = new Scanner(System.in);
		Scanner scnumero = new Scanner(System.in);

		Recipe recipe = new Recipe(null, null, null, null, 0);
		recipe.setRecipeName(sctexto.nextLine());
		recipe.setDescription(sctexto.nextLine());
		recipe.setPhoto(sctexto.nextLine());
		
		Set<Ingredient> ingredients = new HashSet<Ingredient>();
		Ingredient ingredient = new Ingredient();

		System.out.println("¿Cuántos ingredientes tiene la receta?");
		int ingredientsAmount = (new Scanner(System.in)).nextInt();
		
		for (int i = 0 ; i < ingredientsAmount ; i++) {
			ingredient.setName(sctexto.nextLine());
			ingredient.setAmount(scnumero.nextDouble());
			ingredient.setPrice(scnumero.nextDouble());
			
			ingredients.add(ingredient);
		}
		
		recipe.setIngredients(ingredients);
		
		sctexto.close();
		scnumero.close();
		
		return recipe;
	}

	@Override
	public void shareRecipe(Recipe recipe) {
		
		System.out.println(recipe.getRecipeName().concat("\n"));
		for (Ingredient ingredient : recipe.getIngredients()) {
			System.out.println(ingredient.getAmount() + " " + ingredient.getName() + "\n");
		}
		System.out.println(recipe.getDescription());
		
	}

	@Override
	public void valorateRecipe(Recipe recipe, Double valoration) {
		if (recipe.getValorationCounter() == 0) {
			recipe.setValoration(valoration);
		} else {
			recipe.setValorationAccumulated(recipe.getValorationAccumulated()+valoration);
			recipe.setValoration(recipe.getValorationAccumulated()/(recipe.getValorationCounter()+1));
		}
		recipe.setValorationCounter(recipe.getValorationCounter()+1);
	}

}
