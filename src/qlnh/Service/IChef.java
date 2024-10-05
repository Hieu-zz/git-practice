package qlnh.Service;

import qlnh.Modal.Chef;
import qlnh.Modal.Dish;

import java.util.List;

public interface IChef  {
    List<Chef> getAll();
    Chef getbyId(int id );
    void create (Chef chef);
    void update(Chef chef);
    void delete(int id);
}
