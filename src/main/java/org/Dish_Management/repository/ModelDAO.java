package org.Dish_Management.repository;

import org.Dish_Management.model.Order;

import java.util.List;

public interface ModelDAO <Model>{
        List<Model> showAll(int page, int size, Order order);
        void delete(int id);
        Model findById( int id);
        List<Model> saveOrUpdate(List<Model> models);
    }
