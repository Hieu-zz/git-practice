package actions;

import controllers.ChefController;
import controllers.TableController;
import exceptions.InvalidIdException;
import models.Chef;
import models.Table;

import java.util.Scanner;

public class TableActions {
    private final TableController tableController;
    private final ChefController chefController;
    private final Scanner sc;

    public TableActions(TableController tableController, ChefController chefController, Scanner sc) {
        this.tableController = tableController;
        this.chefController = chefController;
        this.sc = sc;
    }

    public void createdTable() {
        try {
            Table table = new Table();
            System.out.print("Id: ");
            table.setId(sc.nextInt());
            System.out.print("Name: ");
            table.setName(sc.next());
            System.out.print("Guest name: ");
            table.setGuestName(sc.next());
            table.setChef(null);
            tableController.create(table);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAllTable() {
        if (tableController.getAll().isEmpty()) {
            System.out.println("Empty table list");
        } else {
            tableController.getAll().forEach(System.out::println);
        }
    }

    public void editedTable() {
        try {
            Table table = new Table();
            System.out.print("Enter table id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            table.setName(sc.next());
            System.out.print("Guest name: ");
            table.setGuestName(sc.next());
            System.out.print("Chef id: ");
            table.setChef(chefController.getById(sc.nextInt()));
            tableController.update(id, table);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeTable() {
        try {
            System.out.print("Enter table id: ");
            int id = sc.nextInt();
            tableController.remove(id);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAllWithChef() {
        if (tableController.getAllWithChef().isEmpty()) {
            System.out.println("Empty table list");
        } else {
            tableController.getAllWithChef().forEach(System.out::println);
        }
    }

    public void getAllWithOutChef() {
        if (tableController.getAllWithOutChef().isEmpty()) {
            System.out.println("Empty table list");
        } else {
            tableController.getAllWithOutChef().forEach(System.out::println);
        }
    }

    public void bookTable() {
        try {
            Table table = new Table();
            System.out.println("Danh sách bàn ăn chưa có bếp trưởng phục vụ: ");
            if (tableController.getAllWithOutChef().isEmpty()) {
                System.out.println("Empty table list");
            } else {
                tableController.getAllWithOutChef().forEach(System.out::println);
            }
            System.out.print("Select table id: ");
            int idTable = sc.nextInt();
            System.out.println("Danh sách bếp trưởng đi làm: ");
            if (chefController.getAllByStatus(true).isEmpty()) {
                System.out.println("Empty chef list");
            } else {
                chefController.getAllByStatus(true).forEach(System.out::println);
            }
            System.out.print("Enter id chef: ");
            Chef chef = chefController.getById(sc.nextInt());
            table.setChef(chef);
            tableController.bookTable(idTable, table);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }
}