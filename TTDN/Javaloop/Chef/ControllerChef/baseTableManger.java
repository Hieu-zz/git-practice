package Chef.ControllerChef;

import java.util.List;
import java.util.Objects;

public interface baseTableManger extends baseClass{
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

    List<Objects> getAllWithChef();
    List<Objects> getAllWithoutChef();

}
