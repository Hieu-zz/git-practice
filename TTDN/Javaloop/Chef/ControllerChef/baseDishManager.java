package Chef.ControllerChef;

import Chef.ModelChef.Dish;

import java.util.Objects;

public interface baseDishManager extends baseClass{
    @Override
    void getAll();

    @Override
    Objects getById(int id);

    @Override
    void crete();

    @Override
    void update(int id);

    @Override
    void delete(int id);
    void getAllbyCategory();
    Dish getBestseller();
}
