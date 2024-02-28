package com.recipe.recipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.recipe.model.Recipe;
import com.recipe.recipe.repository.RecipeRepo;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo recipeRepo;

    public Recipe addRecipe(Recipe recipe) {
        return recipeRepo.save(recipe);
    }

    public List<Recipe> getRecipeByName(String recipeName) {
        return recipeRepo.findByRecipeName(recipeName);
    }

    public Recipe getRecipeById(int recipeId) {
        return recipeRepo.findById(recipeId).orElse(null);
    }
}
