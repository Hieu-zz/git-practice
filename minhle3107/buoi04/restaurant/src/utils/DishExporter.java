package utils;

import models.Dish;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DishExporter {

    public static void exportDishesToFile(List<Dish> dishList, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Dish dish : dishList) {
                writer.write(formatDish(dish));
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String formatDish(Dish dish) {
        return dish.getId() + "," +
                dish.getName() + "," +
                dish.getIngredient() + "," +
                dish.getCategory() + "," +
                dish.getCount();
    }
}