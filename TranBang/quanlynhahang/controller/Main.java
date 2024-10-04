package org.example.quanlynhahang.controller;

import org.example.quanlynhahang.models.Chef;
import org.example.quanlynhahang.models.Dish;
import org.example.quanlynhahang.models.Table;
import org.example.quanlynhahang.service.impl.ChefService;
import org.example.quanlynhahang.service.impl.DishService;
import org.example.quanlynhahang.service.impl.TableService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        DishService ds=new DishService();
        DishController d = new DishController(ds);
        TableService ts = new TableService();
        TableController t = new TableController(ts);

        ChefService c = new ChefService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("============Quan ly nha hang============");
            System.out.println("1. Xem het tat ca mon an");
            System.out.println("2. Them thong tin mon an moi");
            System.out.println("3. Cap nhat thong tin mon an");
            System.out.println("4. Xoa thong tin cua mon an");
            System.out.println("5. Xem het tat ca bep truong");
            System.out.println("6. Them thong tin bep truong");
            System.out.println("7. Cap nhat thong tin bep truong");
            System.out.println("8. Xoa thong tin bep truong");
            System.out.println("9. Xem het tat ca ban");
            System.out.println("10. Them thong tin ban");
            System.out.println("11. Cap nhat thong tin ban");
            System.out.println("12. Xoa thong tin ban");
            System.out.println("13. Mon an theo danh muc");
            System.out.println("14. Goi mon");
            System.out.println("15. Them phòng");
            System.out.println("16. Danh sách nhân viên chưa có phòng");
            System.out.print("Choose an option: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    getAllDish(d);
                    break;
                case 2:
                    addDish(d,sc);
                    break;
                case 3:
                    updateDish(d,sc);
                    break;
                case 4:
                    deleteDish(d,sc);
                    break;
                case 5:
                    c.getAll();
                    break;
                case 6:
                    c.create();
                    break;
                case 7:
                    c.update();
                    break;
                case 8:
                    c.delete();
                    break;
                case 9:
                    getAllTable(t);
                    break;
                case 10:
                    addTable(t,sc);
                    break;
                case 11:
                    updateTable(t,sc);
                    break;
                case 12:
                    deleteTable(t,sc);
                    break;
                case 13:
                    //getAllDishByCategory(t);
                    break;
                default:
                    System.out.println("re-enter");
            }
        }


}

    public static void getAllDish(DishController dishController) {
        dishController.getAllList();
    }
    public static void getAllTable(TableController tableController) {
        tableController.getAllList();
    }

    public static void getAllDishByCategory(DishController dishController,String category){
        dishController.getAllByCategory(category);
    }

    public static void addDish(DishController dishController, Scanner s) {
        Dish dish = new Dish();

        System.out.println("Nhap id cho mon an:");
        dish.setID(s.nextInt());
        s.nextLine();
        System.out.println("Nhap ten mon an:");
        dish.setName(s.nextLine());
        System.out.println("Nhap nguyen lieu mon an:");
        dish.setIngredients(s.nextLine());
        System.out.println(("Nhap loai mon an:"));
        dish.setCategory(s.nextLine());
        System.out.println("Nhap so luong mon an");
        dish.setCount(s.nextInt());
        dishController.createDish(dish);
    }

    public static void addTable(TableController tableController, Scanner s) {
        Table table = new Table();

        System.out.println("Nhap id cho ban:");
        table.setID(s.nextInt());
        s.nextLine();
        System.out.println("Nhap ten ban:");
        table.setName(s.nextLine());
        System.out.println("Nhap ten khach hang:");
        table.setGuestName(s.nextLine());

        tableController.createTable(table);
    }
    public static void updateTable(TableController tableController, Scanner s) {
        Table table = new Table();
        System.out.println("Nhap id ban can cap nhat:");
        int id=s.nextInt();
        s.nextLine();
        System.out.println("Nhap ten ban:");
        String name = s.nextLine();
        table.setName(name);
        System.out.println("Nhap ten khach hang moi cua ban:");
        String guestName = s.nextLine();
        table.setGuestName(guestName);
        tableController.updateTable(table);
    }

    public static void updateDish(DishController dishController, Scanner s) {
        Dish dish = new Dish();
        System.out.println("Nhap id mon an can cap nhat:");
        int id=s.nextInt();
        s.nextLine();
        System.out.println("Nhap ten moi cua mon an:");
        String name = s.nextLine();
        dish.setName(name);
        System.out.println("Nhap nguyen lieu moi cua mon an:");
        String ingredients = s.nextLine();
        dish.setIngredients(ingredients);
        System.out.println(("Nhap loai moi cua mon an:"));
        String category = s.nextLine();
        dish.setCategory(category);
        System.out.println("Cap nhat so luong moi mon an");
        int count = s.nextInt();
        dish.setCount(count);
        dishController.updateDish(dish,id);
    }
    public static void deleteDish(DishController dishController,Scanner s){
        System.out.println("Nhap id mon an b can xoa");
        int id = s.nextInt();
        s.nextLine();
        dishController.deleteDish(id);
    }
    public static void deleteTable(TableController tableController,Scanner s){
        System.out.println("Nhap id ban b can xoa");
        int id = s.nextInt();
        s.nextLine();
        tableController.deleteTable(id);

    }
}
