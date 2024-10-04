package services.interfaces;


import models.Table;

import java.util.List;

public interface ITableServices {
    void create(Table table);

    void update(int id, Table table);

    void remove(int id);

    Table getById(int id);

    List<Table> getAll();

    List<Table> getAllWithChef();

    List<Table> getAllWithOutChef();
}
