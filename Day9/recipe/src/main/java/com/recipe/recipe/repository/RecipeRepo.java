package com.recipe.recipe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipe.recipe.model.Recipe;

public interface RecipeRepo extends JpaRepository<Recipe,Integer> {

    List<Recipe> findByRecipeName(String recipeName);

    
}