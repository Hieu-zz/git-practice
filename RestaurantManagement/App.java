package RestaurantManagement;

import java.util.Scanner;

import RestaurantManagement.controllers.ChefController;
import RestaurantManagement.controllers.DishController;
import RestaurantManagement.controllers.TableController;

public class App {
    TableController tableController = new TableController();
    DishController dishController = new DishController();
    ChefController chefController = new ChefController();

    public void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                showMenu();
                int choice = in.nextInt();
                choiceHandling(choice);
                if (choice == 0) {
                    break;
                }
            }
        }
    }

    public void showMenu() {
        System.out.println();
        System.out.print("1. Table management\n"
                + "2. Dish management\n"
                + "3. Chef management\n"
                + "0. Exit\n"
                + "Your choice: ");
    }

    public void choiceHandling(int choice) {
        switch (choice) {
            case 1:
                tableController.showMenu();
                break;
            case 2:
                dishController.showMenu();
                break;
            case 3:
                chefController.showMenu();
                break;

            default:
                break;
        }
    }
}
