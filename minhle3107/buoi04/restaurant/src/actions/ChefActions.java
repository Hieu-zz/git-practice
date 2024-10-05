package actions;

import controllers.ChefController;
import exceptions.InvalidIdException;
import models.Chef;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class ChefActions {
    private final ChefController chefController;
    private final Scanner sc;

    public ChefActions(ChefController chefController, Scanner sc) {
        this.chefController = chefController;
        this.sc = sc;
    }

    public static void displayChef(List<Chef> chefList) {
        if (chefList.isEmpty()) {
            out.println("Empty chef list");
        } else {
            chefList.forEach(out::println);
        }
    }

    public void getAllChef() {
        displayChef(chefController.getAll());
    }

    public void createdChef() {
        try {
            Chef chef = new Chef();
            out.print("Id: ");
            chef.setId(sc.nextInt());
            inputChef(chef);
            chefController.create(chef);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    private void inputChef(Chef chef) {
        out.print("Name: ");
        chef.setName(sc.next());
        out.print("Phone: ");
        chef.setPhoneNumber(sc.next());
        out.print("Status: ");
        chef.setStatus(sc.nextBoolean());
    }

    public void editedChef() {
        try {
            Chef chef = new Chef();
            out.print("Enter chef id: ");
            int id = sc.nextInt();
            inputChef(chef);
            chefController.update(id, chef);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void removeChef() {
        try {
            out.print("Enter chef id: ");
            int id = sc.nextInt();
            chefController.remove(id);
        } catch (InvalidIdException e) {
            out.println(e.getMessage());
        }
    }

    public void getAllChefByStatus() {
        out.print("enter status (true/false): ");
        boolean status = sc.nextBoolean();
        displayChef(chefController.getAllByStatus(status));
    }
}