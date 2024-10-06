TableControllerpackage org.example.quanlynhahang.controller;

import org.example.quanlynhahang.models.Dish;
import org.example.quanlynhahang.service.impl.IOFileService;

import java.util.List;

public class IOFileController {
        IOFileService ioService= new IOFileService();
        public void export(List<Dish> dishes){
            ioService.exportFile(dishes);
        }
}
