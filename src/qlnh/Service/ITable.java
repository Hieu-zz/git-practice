package qlnh.Service;

import qlnh.Modal.Table;

import java.util.List;

public interface ITable {
    List<Table> getAll();
    Table getbyId(int id );
    void create (Table table);
    void update(Table table);
    void delete(int id);
}
