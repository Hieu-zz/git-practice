package service.impl;

import model.Dish;
import service.DishService;
import util.FileAction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DishServiceImplement implements DishService {
    public List<Dish> dishList=new ArrayList<>();
    public FileAction fileAction=new FileAction();

    public DishServiceImplement() throws IOException {
        dishList.add(new Dish(1, "Há cảo", "abc", "Bánh", 0));
        dishList.add(new Dish(2, "Há cảo", "abcd", "Canh", 0));
        dishList.add(new Dish(3, "Há cảo", "abcde", "xào", 0));
        dishList.add(new Dish(4, "Há cảo", "abcdef", "Nướng", 0));
        dishList.add(new Dish(5, "Há cảo", "abcghi", "Hấp", 0));
        fileAction.writeFile(dishList);
    }

    @Override
    public List<Dish> getAll() throws IOException {
        return fileAction.readFile();
    }

    @Override
    public Dish getById(long id) {
        return this.dishList.stream().filter(x->x.getId()==id).toList().get(0);
    }

    @Override
    public void create(Dish dish) throws IOException {
        this.dishList.add(dish);
    }

    @Override
    public void update(Dish dish) {
        Dish slt_dish=this.dishList.stream().filter(x->x.getId()==dish.getId()).toList().get(0);
        slt_dish.setName(dish.getName());
        slt_dish.setCategory(dish.getCategory());
        slt_dish.setIngredients(dish.getIngredients());
        slt_dish.setCount(dish.getCount());
    }

    @Override
    public void delete(long id) {
        this.dishList.remove(this.dishList.stream().filter(x->x.getId()==id).toList().get(0));
    }

    @Override
    public List<Dish> getAllByCategory(String category) {
        return this.dishList.stream().filter(x->x.getCategory().equals(category)).toList();
    }

    @Override
    public Dish getBestSeller() {
        Dish bestSeller=this.dishList.get(0);
        for (Dish dish:this.dishList){
            if(dish.getCount()>bestSeller.getCount()){
                bestSeller=dish;
            }
        }
        return bestSeller;
    }

    @Override
    public void order(int dishId, int quantity) {
        Dish dish=this.dishList.stream().filter(x->x.getId()==dishId).toList().get(0);
        dish.setCount(dish.getCount()+quantity);
    }

    @Override
    public void xuatThucDon() throws IOException {
        fileAction.writeFile(this.dishList);
    }
}
