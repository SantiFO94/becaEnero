package edu.es.eoi.controller;

import java.util.List;

import edu.es.eoi.entity.Recipe;
import edu.es.eoi.service.RecipeService;
import edu.es.eoi.service.RecipeServiceImpl;

public class RecipeController {

	public List<Recipe> readAll(){
		//comprobaciones: usuario logueado, token de sesión activo
		//llamada al servicio
		
		RecipeService service = new RecipeServiceImpl();
		
		return service.readAll();
	}
}
