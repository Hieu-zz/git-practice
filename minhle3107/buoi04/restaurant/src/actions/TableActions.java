package actions;

import controllers.ChefController;
import controllers.TableController;
import exceptions.InvalidIdException;
import models.Chef;
import models.Table;

import java.util.List;
import java.util.Scanner;

import static actions.ChefActions.displayChef;
import static java.lang.System.*;

public class TableActions {
    private final TableController tableController;
    private final ChefController chefController;
    private final Scanner sc;

    public TableActions(TableController tableController, ChefController chefController, Scanner sc) {
        this.tableController = tableController;
        this.chefController = chefController;
        this.sc = sc;
    }

    public void displayTable(List<Table> tableList) {
        if (tableList.isEmpty()) {
            out.println("Empty table list");
        } else {
            tableList.forEach(out::println);
        }
    }

    public void createdTable() {
        try {
            Table table = new Table();
            out.print("Id: ");
            table.setId(sc.nextInt());
            out.print("Name: ");
            table.setName(sc.next());
            out.print("Guest name: ");
            table.setGuestName(sc.next());
            table.setChef(null);
            tableController.create(table);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void getAllTable() {
        displayTable(tableController.getAll());
    }

    public void editedTable() {
        try {
            Table table = new Table();
            out.print("Enter table id: ");
            int id = sc.nextInt();
            out.print("Name: ");
            table.setName(sc.next());
            out.print("Guest name: ");
            table.setGuestName(sc.next());
            out.print("Chef id: ");
            table.setChef(chefController.getById(sc.nextInt()));
            tableController.update(id, table);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void removeTable() {
        try {
            out.print("Enter table id: ");
            int id = sc.nextInt();
            tableController.remove(id);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void getAllWithChef() {
        displayTable(tableController.getAllWithChef());
    }

    public void getAllWithOutChef() {
        displayTable(tableController.getAllWithOutChef());
    }

    public void bookTable() {
        try {
            Table table = new Table();
            out.println("Danh sách bàn ăn chưa có bếp trưởng phục vụ: ");
            displayTable(tableController.getAllWithOutChef());

            out.print("Select table id: ");
            int idTable = sc.nextInt();
            out.println("Danh sách bếp trưởng đi làm: ");

            displayChef(chefController.getAllByStatus(true));
            
            out.print("Enter id chef: ");
            Chef chef = chefController.getById(sc.nextInt());
            table.setChef(chef);
            tableController.bookTable(idTable, table);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }
}