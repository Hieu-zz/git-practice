package utils;

import models.Dish;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DishLoader {

    public static List<Dish> loadDishesFromFile(String filePath) {
        List<Dish> dishList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 5) {
                    int id = Integer.parseInt(values[0]);
                    String name = values[1];
                    String ingredient = values[2];
                    String category = values[3];
                    int count = Integer.parseInt(values[4]);

                    Dish dish = new Dish(id, name, ingredient, category, count);
                    dishList.add(dish);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dishList;
    }
}