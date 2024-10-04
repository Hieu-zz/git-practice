package RestaurantManagement.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EmployeeManagement.controller.main;
import RestaurantManagement.models.Dish;
import RestaurantManagement.utils.ReadFromFile;
import RestaurantManagement.utils.WriteToFile;

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
        try (FileInputStream fis = new FileInputStream("RestaurantManagement/utils/dishes.txt")) {
            String fileContent = ReadFromFile.ReadFile(fis);
            String[] lines = fileContent.split("\\r?\\n");

            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(";");
                    if (parts.length == 5) {
                        int id = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        String ingredients = parts[2].trim();
                        String category = parts[3].trim();
                        int count = Integer.parseInt(parts[4].trim());

                        dishes.add(new Dish(id, name, ingredients, category, count));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveDishToFile() {
        try (FileOutputStream fos = new FileOutputStream("RestaurantManagement\\utils\\dishes.txt")) {
            for (Dish dish : dishes) {
                String data = dish.toCSV() + "\n";
                WriteToFile.WriteToFileUsingOutputStream(fos, data);
            }
            System.out.println("Dish information written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
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
