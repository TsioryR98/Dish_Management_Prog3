package org.Dish_Management.model;

import java.util.List;
import java.util.Objects;

public class Dish {
    private String name;
    private int dishUnitPrice;
    private List<IngredientQuantity> ingredientQuantityList;

    public Dish() {
    }

    public Dish(String name, int dishUnitPrice, List<IngredientQuantity> ingredientQuantityList) {
        this.name = name;
        this.dishUnitPrice = dishUnitPrice;
        this.ingredientQuantityList = ingredientQuantityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDishUnitPrice() {
        return dishUnitPrice;
    }

    public void setDishUnitPrice(int dishUnitPrice) {
        this.dishUnitPrice = dishUnitPrice;
    }

    public List<IngredientQuantity> getIngredientQuantityList() {
        return ingredientQuantityList;
    }

    public void setIngredientQuantityList(List<IngredientQuantity> ingredientQuantityList) {
        this.ingredientQuantityList = ingredientQuantityList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return getDishUnitPrice() == dish.getDishUnitPrice() && Objects.equals(getName(), dish.getName()) && Objects.equals(getIngredientQuantityList(), dish.getIngredientQuantityList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDishUnitPrice(), getIngredientQuantityList());
    }
}
