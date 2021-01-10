package edu.es.eoi.repository;

import java.util.List;

import edu.es.eoi.entity.Recipe;
import edu.es.eoi.main.MainApp;

public class RecipeRepositoryMemoryImpl implements RecipeRepository{

	@Override
	public void save(Recipe e) {
		MainApp.recipes.put(e.getRecipeName(), e);
		
	}

	@Override
	public Recipe read(String sf) {
		return MainApp.recipes.get(sf);
	}

	@Override
	public void delete(Recipe e) {
		MainApp.recipes.remove(e.getRecipeName());
		
	}

	@Override
	public Recipe update(Recipe e) {
		return e;
	}

	@Override
	public List<Recipe> readAll() {
		return (List<Recipe>)MainApp.recipes.values();
	}

	
}
