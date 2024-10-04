package RestaurantManagement.services;

import java.util.*;

import RestaurantManagement.models.Chef;

public class ChefService {
    List<Chef> chefs = new ArrayList<>();

    public ChefService() {
        chefs.add(new Chef(1,
                "Alice",
                "123-456-7890",
                true));
        chefs.add(new Chef(2,
                "Bob",
                "123-456-7899",
                true));
        chefs.add(new Chef(3,
                "Charlie",
                "123-456-7898",
                true));
        chefs.add(new Chef(4,
                "David",
                "123-456-7897",
                true));
        chefs.add(new Chef(5,
                "Lisa",
                "123-456-7896",
                true));
    }

    public void displayChef() {
        if (chefs.size() > 0) {
            for (Chef chef : chefs) {
                System.out.println(chef + "\n");
            }
        } else {
            System.out.println("There's no chef");
        }
    }

    public void getAvailabeChef(boolean status) {
        if (chefs.size() > 0) {
            for (Chef chef : chefs) {
                if (chef.isStatus() == status) {
                    System.out.println(chef + "\n");
                }
            }
        } else {
            System.out.println("There's no chef");
        }
    }

    public Chef getChefById(int id) {
        return chefs.stream()
                .filter(chef -> chef.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean isDuplicated(int id) {
        for (Chef chef : chefs) {
            if (chef.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void createChef() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter chef ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (isDuplicated(id)) {
                System.out.print("This ID is existing\nTry another ID: ");
            }
        } while (isDuplicated(id));
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = in.nextLine();
        chefs.add(new Chef(id, name, phoneNumber, true));
    }

    public void updateChef() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter chef ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));
        Chef chef = getChefById(id);
        System.out.print("Enter name: ");
        chef.setName(in.nextLine());
        System.out.print("Enter phone number: ");
        chef.setPhoneNumber(in.nextLine());
    }

    public void deleteChef() {
        int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter chef ID: ");
        do {
            id = in.nextInt();
            in.nextLine();
            if (!isDuplicated(id)) {
                System.out.print("This ID doesn't exist\nTry another ID: ");
            }
        } while (!isDuplicated(id));
        chefs.remove(getChefById(id));
        System.out.println("Chef deleted successfully");
    }
}
