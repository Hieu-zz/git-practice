package RestaurantManagement.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import RestaurantManagement.models.Table;

public class TableService {
    List<Table> tables = new ArrayList<>();

    public TableService() {
    }

    public void displayTable() {
        if (tables.size() > 0) {
            for (Table table : tables) {
                System.out.println(table + "\n");
            }
        } else {
            System.out.println("There's no table");
        }
    }

    public void getTableWithChef(boolean hasChef) {
        if (tables.size() > 0) {
            for (Table table : tables) {
                if (table.hasChef() == hasChef) {
                    System.out.println(table + "\n");
                }
            }
        } else {
            System.out.println("There's no table");
        }
    }

    public Table getTableById(int id) {
        return tables.stream()
                .filter(table -> table.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean isDuplicated(int id) {
        for (Table table : tables) {
            if (table.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void createTable() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter table ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (isDuplicated(id)) {
                System.out.print("This ID is existing\nTry another ID: ");
            }
        } while (isDuplicated(id));
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.print("Enter guest name: ");
        String guestName = in.nextLine();
        tables.add(new Table(id, name, guestName, null));
    }

    public void updateTable() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter table ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));
        Table table = getTableById(id);
        System.out.print("Enter name: ");
        table.setName(in.nextLine());
        System.out.print("Enter guest name: ");
        table.setGuestName(in.nextLine());
    }

    public void deleteTable() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter table ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));
        tables.remove(getTableById(id));
        System.out.println("Chef deleted successfully");
    }

    public void addChefForTable() {
        int tableId;
        int chefId;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter table ID: ");
        do {
            tableId = in.nextInt();
            in.nextLine();
            if (!isDuplicated(tableId)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(tableId));
        System.out.print("Enter chef ID: ");
        do {
            chefId = in.nextInt();
            in.nextLine();
            if (!isDuplicated(chefId)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(chefId));
        
    }
}
