package org.example.quanlynhahang.service;

import org.example.quanlynhahang.models.Chef;
import org.example.quanlynhahang.models.Dish;

import java.util.List;

public interface IDishService {
    List<Dish> getAll();
    Dish getById(int id);
    void create(Dish dish);
    void update(Dish dish,int id);
    void delete(int id);
    List<Dish> getAllByCategory(String category);
    Dish getBestSeller();
    void order(int idDish, int quantity);
}
