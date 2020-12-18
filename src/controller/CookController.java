package controller;

import DAO.IDAORecipe;
import model.Recipe;

import java.util.List;

public class CookController extends AbstractCookController{


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
