package org.Dish_Management.repository;

import org.Dish_Management.model.Dish;
import org.Dish_Management.model.Order;

import java.util.List;

public class DishRepository implements ModelDAO<Dish> {
    @Override
    public List<Dish> showAll(int page, int size, Order order) {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Dish findById(int id) {
        return null;
    }

    @Override
    public List<Dish> saveOrUpdate(List<Dish> dishes) {
        return List.of();
    }
}
