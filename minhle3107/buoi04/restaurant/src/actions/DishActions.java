package actions;

import controllers.DishController;
import exceptions.InvalidIdException;
import models.Dish;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class DishActions {
    private final DishController dishController;
    private final Scanner sc;

    public DishActions(DishController dishController, Scanner sc) {
        this.dishController = dishController;
        this.sc = sc;
    }

    public void displayDish(List<Dish> dishList) {
        if (dishList.isEmpty()) {
            out.println("Empty dish list");
        } else {
            dishList.forEach(out::println);
        }
    }

    public void createdDish() {
        try {
            Dish dish = new Dish();
            out.print("Id: ");
            dish.setId(sc.nextInt());
            inputDish(dish);
            dishController.create(dish);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    private void inputDish(Dish dish) {
        out.print("Name: ");
        dish.setName(sc.next());
        out.print("Ingredient: ");
        dish.setIngredient(sc.next());
        out.print("Category: ");
        dish.setCategory(sc.next());
        out.print("Count: ");
        dish.setCount(sc.nextInt());
    }

    public void getAllDish() {
        displayDish(dishController.getAll());
    }

    public void editedDish() {
        try {
            out.print("Enter dish id: ");
            int id = sc.nextInt();
            Dish dish = new Dish();
            inputDish(dish);
            dishController.update(id, dish);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void removeDish() {
        try {
            out.print("Enter dish id: ");
            int id = sc.nextInt();
            dishController.remove(id);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void getAllByCategory() {
        out.print("Enter dish category: ");
        String cateSearch = sc.next();
        displayDish(dishController.getAllByCategory(cateSearch));
    }

    public void getDishBestSeller() {
        out.println(dishController.getBestSeller());
    }

    public void order() {
        try {
            out.println("Danh sách món ăn: ");
            displayDish(dishController.getAll());
            out.print("Chọn id món ăn cần order: ");
            int idDish = sc.nextInt();
            out.println("Nhập số lượng: ");
            int quantityDish = sc.nextInt();
            dishController.order(idDish, quantityDish);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void importDishes() {
        String filePathToImport = System.getProperty("user.dir") + "/data/input/mon-an.txt";
        try {
            dishController.importDishes(filePathToImport);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void exportDishes() {
        String filePathToExport = System.getProperty("user.dir") + "/data/output/menu.txt";
        dishController.exportDishes(filePathToExport);
    }
}