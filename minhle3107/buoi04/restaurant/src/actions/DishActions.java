package actions;

import controllers.DishController;
import exceptions.InvalidIdException;
import models.Dish;

import java.util.Scanner;

public class DishActions {
    private final DishController dishController;
    private final Scanner sc;

    public DishActions(DishController dishController, Scanner sc) {
        this.dishController = dishController;
        this.sc = sc;
    }

    public void createdDish() {
        try {
            Dish dish = new Dish();
            System.out.print("Id: ");
            dish.setId(sc.nextInt());
            inputDish(dish);
            dishController.create(dish);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    private void inputDish(Dish dish) {
        System.out.print("Name: ");
        dish.setName(sc.next());
        System.out.print("Ingredient: ");
        dish.setIngredient(sc.next());
        System.out.print("Category: ");
        dish.setCategory(sc.next());
        System.out.print("Count: ");
        dish.setCount(sc.nextInt());
    }

    public void getAllDish() {
        if (dishController.getAll().isEmpty()) {
            System.out.println("Empty dish list");
        } else {
            dishController.getAll().forEach(System.out::println);
        }
    }

    public void editedDish() {
        try {
            Dish dish = new Dish();
            System.out.print("Enter dish id: ");
            int id = sc.nextInt();
            inputDish(dish);
            dishController.update(id, dish);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeDish() {
        try {
            System.out.print("Enter dish id: ");
            int id = sc.nextInt();
            dishController.remove(id);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAllByCategory() {
        System.out.print("Enter dish category: ");
        String cateSearch = sc.next();
        if (dishController.getAllByCategory(cateSearch).isEmpty()) {
            System.out.println("Empty dish list");
        } else {
            dishController.getAllByCategory(cateSearch).forEach(System.out::println);
        }
    }

    public void getDishBestSeller() {
        System.out.println(dishController.getBestSeller());
    }

    public void order() {
        try {
            System.out.println("Danh sách món ăn: ");
            if (dishController.getAll().isEmpty()) {
                System.out.println("Empty dish list");
            } else {
                dishController.getAll().forEach(System.out::println);
            }
            System.out.print("Chọn id món ăn cần order: ");
            int idDish = sc.nextInt();
            System.out.println("Nhập số lượng: ");
            int quantityDish = sc.nextInt();
            dishController.order(idDish, quantityDish);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void importDishes() {
        String filePathToImport = System.getProperty("user.dir") + "/data/input/mon-an.txt";
        try {
            dishController.importDishes(filePathToImport);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void exportDishes() {
        String filePathToExport = System.getProperty("user.dir") + "/data/output/menu.txt";
        dishController.exportDishes(filePathToExport);
    }
}