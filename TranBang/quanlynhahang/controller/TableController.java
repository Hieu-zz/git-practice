package org.example.quanlynhahang.controller;

import org.example.quanlynhahang.models.Dish;
import org.example.quanlynhahang.models.Table;
import org.example.quanlynhahang.service.impl.DishService;
import org.example.quanlynhahang.service.impl.TableService;

import java.util.List;

public class TableController {
    public static TableService _service;
    public TableController(TableService service){
        _service = service;
    }
    public List<Table> getAllList(){
        return _service.getAll();
    }
    public Table getById(int id){
        return _service.getById(id);
    }
    public  void createTable(Table table){
        _service.create(table);
    }
    public void updateTable(Table table){
        _service.update(table);
    }
    public  void deleteTable(int id){
        _service.delete(id);
    }
}
