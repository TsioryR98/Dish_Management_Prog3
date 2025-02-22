CREATE DATABASE dish_prog3;


-- Create an enum for units
CREATE TYPE unity_type AS ENUM ('GRAMMS', 'LITER', 'UNIT');

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


-- Inserting data into the ingredient table
INSERT INTO ingredient (id_ingredient, name, last_modified, ingredient_unit_price, unity) VALUES
 (1, 'Salt', '2025-02-01', 5, 'GRAMMS'),
 (2, 'Olive Oil', '2025-01-20', 10, 'LITER'),
 (3, 'Chicken Breast', '2025-02-15', 150, 'GRAMMS'),
 (4, 'Tomato', '2025-02-10', 30, 'GRAMMS'),
 (5, 'Garlic', '2025-02-18', 8, 'GRAMMS'),
 (6, 'Cheese', '2025-02-14', 120, 'GRAMMS'),
 (7, 'Onion', '2025-02-12', 15, 'GRAMMS'),
 (8, 'Lettuce', '2025-02-08', 25, 'GRAMMS'),
 (9, 'Rice', '2025-02-05', 3, 'GRAMMS'),
 (10, 'Beef', '2025-02-17', 200, 'GRAMMS');

-- Inserting data into the dish table
INSERT INTO dish (id_dish, name, dish_unit_price) VALUES
(1, 'Chicken Salad', 1200),
(2, 'Beef Stew', 1500),
(3, 'Garlic Rice', 900),
(4, 'Olive Oil Pasta', 1100),
(5, 'Cheese Pizza', 1800),
(6, 'Tomato Soup', 800),
(7, 'Grilled Chicken', 1400),
(8, 'Rice Pilaf', 1000),
(9, 'Lettuce Wraps', 950),
(10, 'Fried Chicken', 1600);

-- Inserting data into the ingredient_quantity table
INSERT INTO ingredient_quantity (id_ingredient_quantity, id_dish, ingredient_id, ingredient_quantity, unity) VALUES
(1, 1, 3, 200, 'GRAMMS'),
 (2, 1, 4, 100, 'GRAMMS'),
 (3, 2, 3, 500, 'GRAMMS'),
 (4, 2, 6, 150, 'GRAMMS'),
 (5, 3, 9, 150, 'GRAMMS'),
 (6, 3, 5, 50, 'GRAMMS'),
 (7, 4, 2, 100, 'LITER'),
 (8, 4, 7, 75, 'GRAMMS'),
 (9, 5, 6, 100, 'GRAMMS'),
 (10, 5, 1, 50, 'GRAMMS'),
 (11, 6, 4, 200, 'GRAMMS'),
 (12, 6, 5, 30, 'GRAMMS'),
 (13, 7, 3, 300, 'GRAMMS'),
 (14, 7, 8, 150, 'GRAMMS'),
 (15, 8, 9, 100, 'GRAMMS'),
 (16, 8, 1, 25, 'GRAMMS'),
 (17, 9, 7, 50, 'GRAMMS'),
 (18, 9, 9, 100, 'GRAMMS'),
 (19, 10, 3, 400, 'GRAMMS'),
 (20, 10, 5, 80, 'GRAMMS');

