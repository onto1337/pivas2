package DAO;

import model.Recipe;

import java.util.List;

public interface IDAORecipe {
    void create(Recipe recipe);
    List<Recipe> getAllRecipes();
    List<Recipe> getChosenRecipes();
    Recipe getRecipeByName(String name);
}
