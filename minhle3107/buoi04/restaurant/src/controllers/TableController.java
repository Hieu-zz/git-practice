package controllers;

import models.Chef;
import models.Table;
import services.ChefServices;
import services.TableServices;

import java.util.List;

public class TableController {
    protected TableServices tableServices;
//    protected ChefServices chefServices

    public TableController() {
    }

    public TableController(TableServices tableServices) {
        this.tableServices = tableServices;
    }

    public List<Table> getAll() {
        return tableServices.getAll();
    }

    public void create(Table table) {
        tableServices.create(table);
    }

    public void update(int id, Table table) {
        tableServices.update(id, table);
    }

    public void remove(int id) {
        tableServices.remove(id);
    }

    public List<Table> getAllWithChef() {
        return tableServices.getAllWithChef();
    }

    public List<Table> getAllWithOutChef() {
        return tableServices.getAllWithOutChef();
    }

    public void bookTable(int id, Table table) {
        tableServices.bookTable(id, table);
    }

}
