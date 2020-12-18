package controller;

import model.Recipe;

import java.util.List;

public class ChefController extends AbstractCookController {
    public void addRecipe(Recipe recipe) {
    }

    public Recipe makeRecipeChosen(Recipe recipe) {
        return null;
    }

    @Override
    public Recipe findRecipe(String name) {
        return super.findRecipe(name);
    }

    @Override
    public List<Recipe> getAllRecipes() {
        return super.getAllRecipes();
    }

    @Override
    public List<Recipe> getChosenRecipes() {
        return super.getChosenRecipes();
    }
}
