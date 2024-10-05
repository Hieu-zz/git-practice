package controllers;

import exceptions.InvalidIdException;
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

    public void create(Dish di) throws InvalidIdException {
        dishServices.create(di);
    }

    public void update(int id, Dish di) throws InvalidIdException {
        dishServices.update(id, di);
    }

    public void remove(int id) throws InvalidIdException {
        dishServices.remove(id);
    }

    public List<Dish> getAllByCategory(String cate) {
        return dishServices.getAllByCategory(cate);
    }

    public Dish getBestSeller() {
        return dishServices.getBestSeller();
    }

    public void order(int id, int quantity) throws InvalidIdException {
        dishServices.order(id, quantity);
    }

    public void importDishes(String filePath) {
        dishServices.importDishes(filePath);
    }

    public void exportDishes(String filePath) {
        dishServices.exportDishes(filePath);
    }

}
