package controller;

import DAO.IDAORecipe;
import model.Recipe;

import java.util.List;

public abstract class AbstractCookController {

    private IDAORecipe daoRecipe;

    public IDAORecipe getDaoRecipe() {
        return daoRecipe;
    }

    public Recipe findRecipe(String name) {
        return null;
    }


    public List<Recipe> getAllRecipes() {
        return null;
    }

    public List<Recipe> getChosenRecipes() {
        return null;
    }
}
