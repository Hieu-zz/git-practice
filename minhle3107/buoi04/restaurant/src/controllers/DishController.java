package controllers;

import models.Dish;
import services.DishServices;

import java.util.List;

public class DishController {
    protected DishServices dishServices;

    public DishController() {
    }

    public DishController(DishServices dishServices) {
        this.dishServices = dishServices;
    }

    public List<Dish> getAll() {
        return dishServices.getAll();
    }

    public void create(Dish di) {
        dishServices.create(di);
    }

    public void update(int id, Dish di) {
        dishServices.update(id, di);
    }

    public void remove(int id) {
        dishServices.remove(id);
    }

    public List<Dish> getAllByCategory (String cate) {
        return dishServices.getAllByCategory(cate);
    }

    public Dish getBestSeller() {
        return dishServices.getBestSeller();
    }

}
