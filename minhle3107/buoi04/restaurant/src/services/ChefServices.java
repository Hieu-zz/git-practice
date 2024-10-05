package services;

import exceptions.InvalidIdException;
import models.Chef;
import services.interfaces.IChefServices;

import java.util.ArrayList;
import java.util.List;

public class ChefServices implements IChefServices {
    List<Chef> chefList = new ArrayList<>();

    public ChefServices() {
        chefList.add(new Chef(1, "Minh", "0987654321", true));
        chefList.add(new Chef(2, "Chang", "0987654322", false));
        chefList.add(new Chef(3, "Nhi", "0987654323", true));
    }

    public ChefServices(List<Chef> chefList) {
        this.chefList = chefList;
    }

    @Override
    public void create(Chef chef) throws InvalidIdException {

        Chef chefCheck = getById(chef.getId());

        if (chefCheck != null) {
            throw new InvalidIdException("Id already exists");
        }

        chefList.add(chef);
        System.out.println("Cretated chef success!");
    }

    @Override
    public void update(int id, Chef chef) throws InvalidIdException {
        Chef chefUpdate = getById(id);

        if (chefUpdate == null) {
            throw new InvalidIdException("Id does not exist");
        }

        chefUpdate.setName(chef.getName());
        chefUpdate.setPhoneNumber(chef.getPhoneNumber());
        chefUpdate.setStatus(chef.isStatus());
        System.out.println("Update chef success");


    }

    @Override
    public void remove(int id) throws InvalidIdException {
        Chef chefRemove = getById(id);

        if (chefRemove == null) {
            throw new InvalidIdException("Id does not exist");
        }

        chefList.remove(chefRemove);
        System.out.println("Delete chef successfully");
    }

    @Override
    public Chef getById(int id) {
        for (Chef chef : chefList) {
            if (chef.getId() == id) {
                return chef;
            }
        }
        return null;
    }

    @Override
    public List<Chef> getAll() {
        return chefList;
    }

    @Override
    public List<Chef> getAllByStatus(boolean status) {
        List<Chef> chefListByStatus = new ArrayList<>();
        for (Chef chef : chefList) {
            if (chef.isStatus() == status) {
                chefListByStatus.add(chef);
            }

        }
        return chefListByStatus;
    }
}
