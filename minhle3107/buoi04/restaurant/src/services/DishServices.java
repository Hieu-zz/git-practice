package services;

import models.Dish;
import services.interfaces.IDishServices;

import java.util.ArrayList;
import java.util.List;

public class DishServices implements IDishServices {

    List<Dish> dishList = new ArrayList<>();

    public DishServices() {
    }

    public DishServices(List<Dish> dishList) {
        this.dishList = dishList;
    }

    @Override
    public void create(Dish dish) {
        dishList.add(dish);
    }

    @Override
    public void update(int id, Dish dish) {
        Dish dishUpdate = getById(id);

        if (dishUpdate == null) {
            System.out.println("Dish not found");
            return;
        }
        dishUpdate.setName(dish.getName());
        dishUpdate.setIngredient(dish.getIngredient());
        dishUpdate.setCategory(dishUpdate.getCategory());
        dishUpdate.setCount(dish.getCount());
        System.out.println("Update dish success");

    }

    @Override
    public void remove(int id) {
        Dish dishRemove = getById(id);

        if (dishRemove == null) {
            System.out.println("Dish not found");
            return;
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
        Dish dishBestSeller = new Dish();

        for (Dish dish : dishList) {
            if (dish.getCount() > dishBestSeller.getCount()) {
                dishBestSeller = dish;
            }
        }

        return dishBestSeller;
    }
}
