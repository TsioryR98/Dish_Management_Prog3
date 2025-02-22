package org.Dish_Management.repository;

import org.Dish_Management.model.Ingredient;
import org.Dish_Management.model.Order;

import java.util.List;

public class IngredientRepository implements  ModelDAO<Ingredient>{
    @Override
    public List<Ingredient> showAll(int page, int size, Order order) {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Ingredient findById(int id) {
        return null;
    }

    @Override
    public List<Ingredient> saveOrUpdate(List<Ingredient> ingredients) {
        return List.of();
    }
}
