package DAO;

import model.Recipe;

import java.sql.Connection;
import java.util.List;

public class DAORecipe implements IDAORecipe {

    private Connection connection;
    private List<Recipe> recipeList;

    @Override
    public void create(Recipe recipe) {

    }

    @Override
    public List<Recipe> getAllRecipes() {
        return null;
    }

    @Override
    public List<Recipe> getChosenRecipes() {
        return null;
    }

    @Override
    public Recipe getRecipeByName(String name) {
        return null;
    }
}
