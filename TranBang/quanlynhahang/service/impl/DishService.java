package org.example.quanlynhahang.service.impl;

import org.example.quanlynhahang.models.Dish;
import org.example.quanlynhahang.service.IDishService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DishService implements IDishService {
    static List<Dish> dishes = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    @Override
    public List<Dish> getAll() {
        if(dishes.isEmpty()){
            System.out.println("khong tim thay mon an");
            return new ArrayList<>();
        }else {
            show(dishes);
        }
        return dishes;
    }

    @Override
    public Dish getById(int id) {
        for (Dish dish: dishes){
            if(dish.getID()==id){
                System.out.println(dish);
            }
        }
        return null;
    }

    @Override
    public void create(Dish dish) {
        if(getById(dish.getID())==null){
            dishes.add(dish);
        }else{
            System.out.println("ID cua mon an da ton tai");
        }
    }

    @Override
    public void update(Dish dish,int id) {
        Dish dish1= getById(id);
        if(dish1==null){
            System.out.println("Khong tim thay thong tin cua mon an can cap nhat");
        }else {
            dish1.setName(dish.getName());
            dish1.setCategory(dish.getCategory());
            dish1.setIngredients(dish.getIngredients());
            dish1.setCount(dish.getCount());
            System.out.println("Cap nhat thong tin mon an thanh cong");
        }
    }
    @Override
    public void delete(int id) {
        Dish dish = getById(id);
        if(dish!=null){
            dishes.remove(dish);
            System.out.println("Xoa thong tin mon an thanh cong");
        }else {
            System.out.println("Khong tim thay thong tin cua mon an can xoa");
        }
    }
    public void show(List<Dish> dishList) {
        for (Dish dish : dishList) {
            System.out.println(dish);
        }
    }
    @Override
    public List<Dish> getAllByCategory(String category) {
        for (Dish dish: dishes){
            if(Objects.equals(dish.getCategory(), category)){
                show(dishes);
            }
        }
        return null;
    }

    @Override
    public Dish getBestSeller() {
        return null;
    }

    @Override
    public void goiMon() {
        getAll();

    }


}

