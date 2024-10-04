package service;

import model.Dish;

import java.io.IOException;
import java.util.List;

public interface DishService extends BaseService<Dish>{
    List<Dish> getAllByCategory(String category);
    Dish getBestSeller();
    void order(int dishId,int quantity);
    void xuatThucDon() throws IOException;
}
