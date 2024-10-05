package qlnh.Service;

import qlnh.Modal.Dish;

import java.util.List;

public interface IDishService {
    List<Dish> getAll();
    Dish getbyId(int id );
    void create (Dish dish);
    void update(Dish dish);
    void delete(int id);
}
