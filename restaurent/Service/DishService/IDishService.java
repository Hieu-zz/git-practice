package restaurent.Service.DishService;

import restaurent.Service.IBaseService;

import java.util.List;
import java.util.Objects;

public interface IDishService extends IBaseService {
    void getAllByCatergory();
    Objects getBestSeller();
}
