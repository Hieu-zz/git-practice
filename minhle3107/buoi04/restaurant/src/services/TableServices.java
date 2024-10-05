package services;

import exceptions.InvalidIdException;
import models.Table;
import services.interfaces.ITableServices;

import java.util.ArrayList;
import java.util.List;

public class TableServices implements ITableServices {

    List<Table> tableList = new ArrayList<>();

    public TableServices() {
        tableList.add(new Table(1, "Table 1", "Guest 1", null));
        tableList.add(new Table(2, "Table 2", "Guest 2", null));
        tableList.add(new Table(3, "Table 3", "Guest 3", null));
    }

    public TableServices(List<Table> tableList) {
        this.tableList = tableList;
    }

    @Override
    public void create(Table table) throws InvalidIdException {
        Table tableCheck = getById(table.getId());

        if (tableCheck != null) {
            throw new InvalidIdException("Id already exists");

        }

        tableList.add(table);
        System.out.println("Created table success!");
    }

    @Override
    public void update(int id, Table table) throws InvalidIdException {
        Table tableUpdate = getById(id);

        if (tableUpdate == null) {
            throw new InvalidIdException("Id does not exist");
        }

        tableUpdate.setName(table.getName());
        tableUpdate.setGuestName(table.getGuestName());
        tableUpdate.setChef(table.getChef());
        System.out.println("Update table success");
    }

    @Override
    public void remove(int id) throws InvalidIdException {
        Table tableRemove = getById(id);

        if (tableRemove == null) {
            throw new InvalidIdException("Id does not exist");
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
            if (table.getChef() == null) {
                getAllWithOutChef.add(table);
            }
        }
        return getAllWithOutChef;
    }

    public void bookTable(int id, Table table) throws InvalidIdException {
        Table tableBook = getById(id);

        if (tableBook == null) {
            throw new InvalidIdException("Id table does not exist");
        }
        tableBook.setChef(table.getChef());
        System.out.println("Book room success");
    }
}
