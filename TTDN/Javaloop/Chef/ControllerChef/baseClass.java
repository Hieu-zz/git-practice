package Chef.ControllerChef;

import java.util.List;
import java.util.Objects;

public interface baseClass {
    void  getAll();
    Objects getById(int id);
    void crete();

    void update(int id);

    void  delete(int id);
}
