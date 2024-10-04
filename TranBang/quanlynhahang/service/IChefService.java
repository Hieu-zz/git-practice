package org.example.quanlynhahang.service;

import org.example.quanlynhahang.models.Chef;

import java.util.List;

public interface IChefService {
    List<Chef> getAll();
    Chef getById(int id);
    void create();
    void update();
    void delete();
    Chef getChefByStatus(boolean status);
}
