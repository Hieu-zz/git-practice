package RestaurantManagement.controllers;

import java.util.Scanner;

import RestaurantManagement.services.DishService;

public class DishController {
    DishService dishService;

    public DishController() {
        this.dishService = new DishService();
    }

    public void showMenu() {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("1. Show all the dishes\n"
                + "2. Show dishes by category\n"
                + "3. Show the best seller\n"
                + "4. Add a dish\n"
                + "5. Edit a dish\n"
                + "6. Delete a dish\n"
                + "7. Order a dish\n"
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
                dishService.displayDish();
                seperator();
                break;
            case 2:
                seperator();
                dishService.getDishByCategory();
                seperator();
                break;
            case 3:
                seperator();
                dishService.bestSeller();
                seperator();
                break;
            case 4:
                seperator();
                dishService.createDish();
                dishService.saveDishToFile();
                seperator();
                break;
            case 5:
                seperator();
                dishService.updateDish();
                dishService.saveDishToFile();
                seperator();
                break;
            case 6:
                seperator();
                dishService.deleteDish();
                dishService.saveDishToFile();
                seperator();
                break;
            case 7:
                seperator();
                dishService.sell();
                dishService.saveDishToFile();
                seperator();
                break;
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
