package model;

import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private boolean isChosen;
    private List<String> ingredients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChosen() {
        return isChosen;
    }

    public void setChosen(boolean chosen) {
        isChosen = chosen;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
