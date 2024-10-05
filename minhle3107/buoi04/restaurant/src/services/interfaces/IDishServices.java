package services.interfaces;

import models.Dish;

import java.util.List;

public interface IDishServices {
    void create(Dish dish);

    void update(int id, Dish dish);

    void remove(int id);

    Dish getById(int id);

    List<Dish> getAll();

    List<Dish> getAllByCategory(String cate);

    Dish getBestSeller();

    void order(int id, int quantity);

    void importDishes(String filePath);

    void exportDishes(String filePath);
}
