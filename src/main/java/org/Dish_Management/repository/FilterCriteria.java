package org.Dish_Management.repository;

public class FilterCriteria {
    private String column;
    private Object value;

    public FilterCriteria(String column, Object value) {
        this.column = column;
        this.value = value;
    }

    public String getColumn() {
        return column;
    }
    public Object getValue() {
        return value;
    }
}
