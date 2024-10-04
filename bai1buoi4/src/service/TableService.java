package service;

import model.Chef;
import model.Table;

import java.util.List;

public interface TableService extends BaseService<Table> {
    List<Table> getAllWithChef();
    List<Table> getAllWithoutChef();
    void phan_cong(int tableId, Chef chef);
}
