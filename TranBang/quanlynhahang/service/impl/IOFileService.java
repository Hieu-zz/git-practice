package org.example.quanlynhahang.service.impl;

import org.example.quanlynhahang.models.Dish;
import org.example.quanlynhahang.utils.IOFile;

import java.util.List;

public class IOFileService {
    IOFile io = new IOFile();
    public void  exportFile(List<Dish> dishes){
        io.writeFile(dishes);
        System.out.println("xuat file thanh cong");
    }
}
