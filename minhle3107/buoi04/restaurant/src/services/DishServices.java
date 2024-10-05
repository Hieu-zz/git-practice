package services;

import exceptions.InvalidIdException;
import models.Dish;
import services.interfaces.IDishServices;

import java.util.ArrayList;
import java.util.List;

public class DishServices implements IDishServices {

    List<Dish> dishList = new ArrayList<>();

    public DishServices() {
        dishList.add(new Dish(1, "Bún đậu", "Bún", "Bún", 0));
        dishList.add(new Dish(2, "Phở bò", "Thịt bò", "Phở", 0));
        dishList.add(new Dish(3, "Bánh mỳ", "Bột mỳ", "Đồ ăn nhanh", 0));
    }

    public DishServices(List<Dish> dishList) {
        this.dishList = dishList;
    }

    @Override
    public void create(Dish dish) throws InvalidIdException {
        Dish dickCheck = getById(dish.getId());

        if (dickCheck != null) {
            throw new InvalidIdException("Id already exists");

        }
        dishList.add(dish);
    }

    @Override
    public void update(int id, Dish dish) throws InvalidIdException {
        Dish dishUpdate = getById(id);

        if (dishUpdate == null) {
            throw new InvalidIdException("Id does not exist");
        }
        dishUpdate.setName(dish.getName());
        dishUpdate.setIngredient(dish.getIngredient());
        dishUpdate.setCategory(dishUpdate.getCategory());
        dishUpdate.setCount(dish.getCount());
        System.out.println("Update dish success");

    }

    @Override
    public void remove(int id) throws InvalidIdException {
        Dish dishRemove = getById(id);

        if (dishRemove == null) {
            throw new InvalidIdException("Id does not exist");
        }

        dishList.remove(dishRemove);
        System.out.println("Delete dish successfully");

    }

    @Override
    public Dish getById(int id) {
        for (Dish dish : dishList) {
            if (dish.getId() == id) {
                return dish;
            }
        }
        return null;
    }

    @Override
    public List<Dish> getAll() {
        return dishList;
    }

    @Override
    public List<Dish> getAllByCategory(String cate) {
        List<Dish> getAllByCategory = new ArrayList<>();
        for (Dish dish : dishList) {
            if (dish.getCategory().equalsIgnoreCase(cate)) {
                getAllByCategory.add(dish);
            }
        }
        return getAllByCategory;
    }

    @Override
    public Dish getBestSeller() {
        Dish dishBestSeller = dishList.getFirst();

        for (Dish dish : dishList) {
            if (dish.getCount() > dishBestSeller.getCount()) {
                dishBestSeller = dish;
            }
        }

        return dishBestSeller;
    }

    @Override
    public void order(int id, int quantity) throws InvalidIdException {
        Dish dishOrder = getById(id);

        if (dishOrder == null) {
            throw new InvalidIdException("Id dish does not exist");
        }

        dishOrder.order(quantity);
        System.out.println("Order successfully");
    }

    @Override
    public void importDishes(String filePath) throws InvalidIdException {
        List<Dish> dishImport = utils.DishLoader.loadDishesFromFile(filePath);
        List<Integer> listOfIdsAlreadyExists = new ArrayList<>();

        for (Dish dish : dishImport) {
            if (getById(dish.getId()) != null) {
                listOfIdsAlreadyExists.add(dish.getId());
            } else {
                dishList.add(dish);
            }
        }

        for (Integer idExists : listOfIdsAlreadyExists) {
            System.out.println("Id " + idExists + " already exists");
        }

        System.out.println("Data imported successfully.");
    }

    @Override
    public void exportDishes(String filePath) {

        utils.DishExporter.exportDishesToFile(dishList, filePath);
        System.out.println("Data exported successfully.");

    }

}
