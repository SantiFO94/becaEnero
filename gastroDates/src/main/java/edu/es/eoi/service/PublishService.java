package edu.es.eoi.service;

import edu.es.eoi.entity.Recipe;

public interface PublishService {

	Recipe publishRecipe();

	void shareRecipe(Recipe recipe);

	void valorateRecipe(Recipe recipe, Double valoration);

}
