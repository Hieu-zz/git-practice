package org.example.quanlynhahang.utils;

import org.example.quanlynhahang.models.Dish;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IOFile {
    private String file = "E:/CY_VietNam/Buoi4_QuanLy/DataOutPut.txt";
    public void writeFile(List<Dish> dishes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Dish dish : dishes) {
                writer.write(dish.getID() + "," + dish.getName() + "," + dish.getCount());
                writer.newLine();
            }
            System.out.println("xuat file thanh cong");
        } catch (IOException e) {
            System.err.println("loi: " + e.getMessage());
        }
    }
}
