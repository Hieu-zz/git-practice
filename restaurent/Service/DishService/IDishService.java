package restaurent.Service.DishService;

import restaurent.Model.Dish;
import restaurent.Service.IBaseService;

import java.util.List;
import java.util.Objects;

public interface IDishService extends IBaseService {
    void getAllByCatergory();
    Dish getBestSeller();
}
