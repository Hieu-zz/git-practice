package services;

import models.Table;
import services.interfaces.ITableServices;

import java.util.ArrayList;
import java.util.List;

public class TableServices implements ITableServices {

    List<Table> tableList = new ArrayList<>();

    public TableServices() {
    }

    public TableServices(List<Table> tableList) {
        this.tableList = tableList;
    }

    @Override
    public void create(Table table) {
        tableList.add(table);
    }

    @Override
    public void update(int id, Table table) {
        Table tableUpdate = getById(id);

        if (tableUpdate == null) {
            System.out.println("Table not found");
            return;
        }

        tableUpdate.setName(table.getName());
        tableUpdate.setGuestName(table.getGuestName());
        tableUpdate.setChef(table.getChef());
        System.out.println("Update table success");
    }

    @Override
    public void remove(int id) {
        Table tableRemove = getById(id);

        if (tableRemove == null) {
            System.out.println("Table not found");
            return;
        }

        tableList.remove(tableRemove);
        System.out.println("Delete table successfully");

    }

    @Override
    public Table getById(int id) {
        for (Table table : tableList) {
            if (table.getId() == id) {
                return table;
            }
        }
        return null;
    }

    @Override
    public List<Table> getAll() {
        return tableList;
    }

    @Override
    public List<Table> getAllWithChef() {
        List<Table> getAllWithChef = new ArrayList<>();

        for (Table table : tableList) {
            if (table.getChef() != null) {
                getAllWithChef.add(table);
            }
        }
        return getAllWithChef;
    }

    @Override
    public List<Table> getAllWithOutChef() {
        List<Table> getAllWithOutChef = new ArrayList<>();

        for (Table table : tableList) {
            if (table.getChef() != null) {
                getAllWithOutChef.add(table);
            }
        }
        return getAllWithOutChef;
    }

    public void bookTable(int id, Table table) {
        Table tableBook = getById(id);

        if (tableBook == null) {
            System.out.println("Table not found");
            return;
        }
        tableBook.setChef(table.getChef());
        System.out.println("Book room success");
    }
}
