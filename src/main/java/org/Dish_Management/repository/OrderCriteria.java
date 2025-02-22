package org.Dish_Management.repository;

import org.Dish_Management.model.Order;

public class OrderCriteria {
     private String column;
     private Order order;

    public OrderCriteria(String column, Order order) {
        this.column = column;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
    public String getColumn() {
        return column;
    }
}
