package edu.es.eoi.repository;

import java.util.List;

import edu.es.eoi.entity.Recipe;

public interface RecipeRepository extends CrudInterface<Recipe, String>{

	public List<Recipe> readAll();
}
