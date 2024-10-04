package RestaurantManagement.controllers;

import java.util.Scanner;

import RestaurantManagement.services.TableService;

public class TableController {
    TableService tableService;

    public TableController() {
        tableService = new TableService();
    }

    public void showMenu() {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("1. Show all the tables\n"
                + "2. Show the table without chef\n"
                + "3. Show the table with chef\n"
                + "4. Add a table\n"
                + "5. Update a table\n"
                + "6. Delete a table\n"
                + "0. Exit\n"
                + "Your choice: ");
        int choice = in.nextInt();
        choiceHandling(choice);
        if (choice == 0) {
            return;
        }
    }

    private void choiceHandling(int choice) {
        switch (choice) {
            case 1:
                seperator();
                tableService.displayTable();
                seperator();
                break;
            case 2:
                seperator();
                tableService.getTableWithChef(false);
                seperator();
            case 3:
                seperator();
                tableService.getTableWithChef(true);
                seperator();
            case 4:
                seperator();
                tableService.createTable();
                seperator();
                break;
            case 5:
                seperator();
                tableService.updateTable();
                seperator();
            case 6:
                seperator();
                tableService.deleteTable();
                seperator();
            default:
                break;
        }
    }

    private void seperator() {
        for (int i = 0; i < 100; i++) {
            System.out.print('~');
        }
        System.out.println();
    }
}
