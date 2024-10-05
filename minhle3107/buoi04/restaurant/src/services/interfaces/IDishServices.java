package services.interfaces;

import exceptions.InvalidIdException;
import models.Dish;

import java.util.List;

public interface IDishServices {
    void create(Dish dish) throws InvalidIdException;

    void update(int id, Dish dish) throws InvalidIdException;

    void remove(int id) throws InvalidIdException;

    Dish getById(int id);

    List<Dish> getAll();

    List<Dish> getAllByCategory(String cate);

    Dish getBestSeller();

    void order(int id, int quantity) throws InvalidIdException;

    void importDishes(String filePath);

    void exportDishes(String filePath);
}
