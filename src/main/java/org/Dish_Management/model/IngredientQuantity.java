package org.Dish_Management.model;

import java.util.Objects;

public class IngredientQuantity {
    private Ingredient ingredient;
    private double ingredientQuantity;
    private Unity unity;

    public IngredientQuantity(Unity unity, double ingredientQuantity, Ingredient ingredient) {
        this.unity = unity;
        this.ingredientQuantity = ingredientQuantity;
        this.ingredient = ingredient;
    }
    public IngredientQuantity() {
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getIngredientQuantity() {
        return ingredientQuantity;
    }

    public void setIngredientQuantity(double ingredientQuantity) {
        this.ingredientQuantity = ingredientQuantity;
    }

    public Unity getUnity() {
        return unity;
    }

    public void setUnity(Unity unity) {
        this.unity = unity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IngredientQuantity that = (IngredientQuantity) o;
        return Double.compare(getIngredientQuantity(), that.getIngredientQuantity()) == 0 && Objects.equals(getIngredient(), that.getIngredient()) && getUnity() == that.getUnity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIngredient(), getIngredientQuantity(), getUnity());
    }
}
