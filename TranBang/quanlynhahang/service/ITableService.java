package org.example.quanlynhahang.service;

import org.example.quanlynhahang.models.Chef;
import org.example.quanlynhahang.models.Dish;
import org.example.quanlynhahang.models.Table;

import java.util.List;

public interface ITableService {
    List<Table> getAll();
    Table getById(int id);
    void create(Table table);
    void update(Table table,int id);
    void delete(int id);
    List<Table> getAllTableWithChef();
    List<Table> getAllTableWithoutChef();
}
