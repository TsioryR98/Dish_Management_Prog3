CREATE DATABASE dish_prog3;


-- Create an enum for units
CREATE TYPE unity_type AS ENUM ('GRAMMS', 'LITER', 'UNIT');

-- Create Ingredient table
-- Create Ingredient table
CREATE TABLE ingredient (
id_ingredient INT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
last_modified DATE NOT NULL,
ingredient_unit_price INT NOT NULL,
unity unity_type NOT NULL
);

-- Create Dish table
CREATE TABLE dish (
id_dish INT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
dish_unit_price INT NOT NULL
);

-- Create IngredientQuantity table to map ingredients and their quantities in dishes
CREATE TABLE ingredient_quantity (
    id_ingredient_quantity INT PRIMARY KEY,
    id_dish INT NOT NULL,
    ingredient_id INT NOT NULL,
    ingredient_quantity DOUBLE PRECISION NOT NULL,
    unity unity_type NOT NULL,
    FOREIGN KEY (ingredient_id) REFERENCES ingredient(id_ingredient),
    FOREIGN KEY (id_dish) REFERENCES dish(id_dish),
    CONSTRAINT pk_ingredient_quantity PRIMARY KEY (id_dish, ingredient_id)
)

