package controllers;

import exceptions.InvalidIdException;
import models.Chef;
import services.ChefServices;

import java.util.List;

public class ChefController {
    protected ChefServices chefServices;

    public ChefController() {
    }

    public ChefController(ChefServices chefServices) {
        this.chefServices = chefServices;
    }

    public Chef getById(int id) {
        return chefServices.getById(id);
    }

    public List<Chef> getAll() {
        return chefServices.getAll();
    }

    public void create(Chef chef) throws InvalidIdException {
        chefServices.create(chef);
    }

    public void update(int id, Chef chef) throws InvalidIdException {
        chefServices.update(id, chef);
    }

    public void remove(int id) throws InvalidIdException {
        chefServices.remove(id);
    }

    public List<Chef> getAllByStatus(boolean status) {
        return chefServices.getAllByStatus(status);
    }

}
