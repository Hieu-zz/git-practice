package Chef.ControllerChef;

import java.util.List;
import java.util.Objects;

public interface baseChefManager extends baseClass{
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

    void getAllbyStatus(boolean status);
}
