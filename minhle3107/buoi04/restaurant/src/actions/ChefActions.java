package actions;

import controllers.ChefController;
import exceptions.InvalidIdException;
import models.Chef;

import java.util.Scanner;

public class ChefActions {
    private final ChefController chefController;
    private final Scanner sc;

    public ChefActions(ChefController chefController, Scanner sc) {
        this.chefController = chefController;
        this.sc = sc;
    }

    public void getAllChef() {
        if (chefController.getAll().isEmpty()) {
            System.out.println("Empty chef list");
        } else {
            chefController.getAll().forEach(System.out::println);
        }
    }

    public void createdChef() {
        try {
            Chef chef = new Chef();
            System.out.print("Id: ");
            chef.setId(sc.nextInt());
            inputChef(chef);
            chefController.create(chef);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    private void inputChef(Chef chef) {
        System.out.print("Name: ");
        chef.setName(sc.next());
        System.out.print("Phone: ");
        chef.setPhoneNumber(sc.next());
        System.out.print("Status: ");
        chef.setStatus(sc.nextBoolean());
    }

    public void editedChef() {
        try {
            Chef chef = new Chef();
            System.out.print("Enter chef id: ");
            int id = sc.nextInt();
            inputChef(chef);
            chefController.update(id, chef);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeChef() {
        try {
            System.out.print("Enter chef id: ");
            int id = sc.nextInt();
            chefController.remove(id);
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getAllChefByStatus() {
        System.out.print("enter status (true/false): ");
        boolean status = sc.nextBoolean();
        if (chefController.getAllByStatus(status).isEmpty()) {
            System.out.println("Empty chef list");
        } else {
            chefController.getAllByStatus(status).forEach(System.out::println);
        }
    }
}