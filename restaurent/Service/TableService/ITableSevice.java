package restaurent.Service.TableService;

import restaurent.Model.Table;
import restaurent.Service.IBaseService;

import java.util.List;
import java.util.Objects;

public interface ITableSevice extends IBaseService {
   void getAllWithChef();
    void getAllWithoutChef();
}
