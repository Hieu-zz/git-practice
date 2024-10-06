package org.example.quanlynhahang.controller;

import org.example.quanlynhahang.models.Chef;
import org.example.quanlynhahang.models.Table;
import org.example.quanlynhahang.service.impl.ChefService;
import org.example.quanlynhahang.service.impl.DishService;

import java.util.List;

public class ChefController {
    public ChefService _service;
    public ChefController(ChefService service){
        _service = service;
    }

    public List<Chef> getAllList(){
        return _service.getAll();
    }
    public Chef getById(int id){
        return _service.getById(id);
    }
    public  void createChef(Chef chef){
        _service.create(chef);
    }
    public void updateChef(){
        _service.update();
    }
    public  void deleteChef(){
        _service.delete();
    }
}
