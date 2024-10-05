package services.interfaces;


import exceptions.InvalidIdException;
import models.Table;

import java.util.List;

public interface ITableServices {
    void create(Table table) throws InvalidIdException;

    void update(int id, Table table) throws InvalidIdException;

    void remove(int id) throws InvalidIdException;

    Table getById(int id);

    List<Table> getAll();

    List<Table> getAllWithChef();

    List<Table> getAllWithOutChef();
}
