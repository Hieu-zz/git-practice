package org.example.quanlynhahang.controller;

import org.example.quanlynhahang.models.Dish;
import org.example.quanlynhahang.service.impl.DishService;

import java.util.List;

public class DishController {

    public DishService _service;
    public DishController(DishService service){
        _service = service;
    }
    public List<Dish> getAllList(){
        return _service.getAll();
    }
    public Dish getById(int id){
        return _service.getById(id);
    }
    public void createDish(Dish dish){
        _service.create(dish);
    }
    public void updateDish(Dish dish,int id){
        _service.update(dish,id);
    }
    public void deleteDish(int id){
        _service.delete(id);
    }
    public void getAllDishByCategory(String category){
        _service.getAllByCategory(category);
    }
    public void getBestSeller(){
        _service.getBestSeller();
    }
    public void order(int idDish,int quantity){
        _service.order(idDish,quantity);
    }
}
