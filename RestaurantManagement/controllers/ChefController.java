package RestaurantManagement.controllers;

import java.util.Scanner;

import RestaurantManagement.services.ChefService;

public class ChefController {

    ChefService chefService;

    public ChefController() {
        this.chefService = new ChefService();
    }

    public void showMenu() {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("1. Show all the chefs\n"
                + "2. Show the available chefs\n"
                + "3. Add a chef\n"
                + "4. Update a chef\n"
                + "5. Delete a chef\n"
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
                chefService.displayChef();
                seperator();
                break;
            case 2:
                seperator();
                chefService.getAvailabeChef(true);
                seperator();
                break;
            case 3:
                seperator();
                chefService.createChef();
                seperator();
                break;
            case 4:
                seperator();
                chefService.updateChef();
                seperator();
                break;
            case 5:
                seperator();
                chefService.deleteChef();
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
