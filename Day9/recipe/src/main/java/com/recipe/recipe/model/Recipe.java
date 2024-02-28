package com.recipe.recipe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recipe {
    @Id
    private int recipeId;
    private String title;
    private String ingredients;
    private String instructions;
    private String recipeName;

    public Recipe() {
    }

    public Recipe(int recipeId, String title, String ingredients, String instructions, String recipeName) {
        this.recipeId = recipeId;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.recipeName = recipeName;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
}
