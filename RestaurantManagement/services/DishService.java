package RestaurantManagement.services;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import RestaurantManagement.models.Dish;
import RestaurantManagement.utils.FileUtils;

public class DishService {
    List<Dish> dishes = new ArrayList<>();

    public DishService() {
        getDishesFromFile();
    }

    public void displayDish() {
        if (dishes.size() > 0) {
            for (Dish dish : dishes) {
                System.out.println(dish + "\n");
            }
        } else {
            System.out.println("There's no dish");
        }
    }

    public void getDishesFromFile() {
        String path = "RestaurantManagement\\utils\\dishes.txt";
        try (FileInputStream fileIn = new FileInputStream(path);
                ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
            while (true) {
                try {
                    Dish dish = FileUtils.readObjectFromFile(objIn, Dish.class);
                    dishes.add(dish);
                } catch (EOFException e) {
                    break;
                } catch (ClassCastException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveDishToFile() {
        String path = "RestaurantManagement\\utils\\dishes.txt";
        try (FileOutputStream fileOut = new FileOutputStream(path);
                ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
            for (Dish dish : dishes) {
                FileUtils.writeObjectToFile(objOut, dish);
            }
            System.out.println("Đã ghi danh sách Person vào file.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.getCause();
        }
    }

    public Dish getDishById(int id) {
        return dishes.stream()
                .filter(dish -> dish.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private List<String> getCategories() {
        List<String> category = new ArrayList<>();
        for (Dish dish : dishes) {
            category.add(dish.getCategory());
        }
        return category;
    }

    public void getDishByCategory() {
        List<String> categories = getCategories();
        System.out.println("Which category would you like to know?");
        Scanner in = new Scanner(System.in);
        int i = 0;
        for (String category : categories) {
            System.out.println((i + 1) + ". " + category);
            i++;
        }
        System.out.print("Your choice: ");
        int index = in.nextInt();
        in.nextLine();
        String category = categories.get(index - 1);
        System.out.println();
        System.out.println("Dishes in " + category + ":");
        for (Dish dish : dishes) {
            if (dish.getCategory().equalsIgnoreCase(category)) {
                System.out.println(dish);
            }
        }
    }

    public boolean isDuplicated(int id) {
        for (Dish dish : dishes) {
            if (dish.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void createDish() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dish ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (isDuplicated(id)) {
                System.out.print("This ID is existing\nTry another ID: ");
            }
        } while (isDuplicated(id));
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.print("Enter ingredients: ");
        String ingredients = in.nextLine();
        System.out.print("Enter category: ");
        String category = in.nextLine();
        dishes.add(new Dish(id, name, ingredients, category, 0));
    }

    public void updateDish() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dish ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));
        Dish dish = getDishById(id);
        System.out.print("Enter name: ");
        dish.setName(in.nextLine());
        System.out.print("Enter ingredients: ");
        dish.setIngredients(in.nextLine());
        System.out.print("Enter category: ");
        dish.setCategory(in.nextLine());
    }

    public void deleteDish() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dish ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));
        dishes.remove(getDishById(id));
        System.out.println("Dish deleted successfully");
    }

    public void sell() {
        System.out.println("What would your like to order?\n");
        displayDish();
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dish ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));
        Dish dishToOrder = getDishById(id);
        int currentCount = dishToOrder.getCount();
        System.out.print("How many would you like to order? ");
        int quantity = in.nextInt();
        in.nextLine();
        dishToOrder.setCount(currentCount += quantity);
        System.out.println("The food is comming right up");
    }

    public void bestSeller() {
        Dish max = dishes.get(0);
        for (Dish dish : dishes) {
            if (dish.getCount() > max.getCount()) {
                max = dish;
            }
        }
        System.out.println(max);
    }
}
