package org.Dish_Management.model;

import java.time.LocalDate;
import java.util.Objects;

public class Ingredient {
    private String name;
    private LocalDate lastModified;
    private int ingredientUnitPrice;
    private Unity unity;

    public Ingredient(String name, LocalDate lastModified, int ingredientUnitPrice, Unity unity) {
        this.name = name;
        this.lastModified = lastModified;
        this.ingredientUnitPrice = ingredientUnitPrice;
        this.unity = unity;
    }
    public Ingredient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDate lastModified) {
        this.lastModified = lastModified;
    }

    public int getIngredientUnitPrice() {
        return ingredientUnitPrice;
    }

    public void setIngredientUnitPrice(int ingredientUnitPrice) {
        this.ingredientUnitPrice = ingredientUnitPrice;
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
        Ingredient that = (Ingredient) o;
        return getIngredientUnitPrice() == that.getIngredientUnitPrice() && Objects.equals(getName(), that.getName()) && Objects.equals(getLastModified(), that.getLastModified()) && getUnity() == that.getUnity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastModified(), getIngredientUnitPrice(), getUnity());
    }
}
