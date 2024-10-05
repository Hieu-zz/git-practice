import controllers.ChefController;
import controllers.DishController;
import controllers.TableController;
import models.Chef;
import models.Dish;
import models.Table;
import services.ChefServices;
import services.DishServices;
import services.TableServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChefServices chefServices = new ChefServices();
        DishServices dishServices = new DishServices();
        TableServices tableServices = new TableServices();

        ChefController chefController = new ChefController(chefServices);
        DishController dishController = new DishController(dishServices);
        TableController tableController = new TableController(tableServices);

        Scanner sc = new Scanner(System.in);

        int choose;

        do {
            System.out.println("********************************** MENU **********************************");
            System.out.println("********************************** Chef **********************************");
            System.out.println("1. Thêm đầu bếp");
            System.out.println("2. Hiển thị danh sách đầu bếp");
            System.out.println("3. Sửa thông tin đầu bếp");
            System.out.println("4. Xóa đầu bếp");
            System.out.println("5. Danh sách bếp trưởng theo trạng thái");

            System.out.println("********************************** Món ăn **********************************");
            System.out.println("6. Thêm món ăn");
            System.out.println("7. Hiển thị danh sách món ăn");
            System.out.println("8. Sửa thông tin món ăn");
            System.out.println("9. Xóa món ăn");
            System.out.println("10. Danh sách món ăn theo danh mục");
            System.out.println("11. Món ăn bán chạy nhất");

            System.out.println("********************************** Bàn **********************************");
            System.out.println("12. Thêm bàn ăn mới");
            System.out.println("13. Hiển thị danh sách bàn");
            System.out.println("14. Sửa thông tin bàn");
            System.out.println("15. Xóa bàn");
            System.out.println("16. Danh sách bàn đã có bếp trưởng phục vụ");
            System.out.println("17. Danh sách bàn chưa có bếp trưởng phục vụ");
            System.out.println("18. Tạo bàn ăn cho khách hàng:");


            System.out.println("********************************************************************");
            System.out.println("19. Gọi món");
            System.out.println("20. Xuất thực đơn");
            System.out.println("21. Nhập món ăn từ file");
            System.out.println("********************************************************************");
            System.out.println("0. Thoát!");

            System.out.print("Nhập vào lựa chọn của bạn: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    createdChef(chefController);
                    break;
                case 2:
                    getAllChef(chefController);
                    break;
                case 3:
                    editedChef(chefController);
                    break;
                case 4:
                    removeChef(chefController);
                    break;
                case 5:
                    getAllChefByStatus(chefController);
                    break;
                case 6:
                    createdDish(dishController);
                    break;
                case 7:
                    getAllDish(dishController);
                    break;
                case 8:
                    editedDish(dishController);
                    break;
                case 9:
                    removeDish(dishController);
                    break;
                case 10:
                    getAllByCategory(dishController);
                    break;
                case 11:
                    getDishBestSeller(dishController);
                    break;
                case 12:
                    createdTable(tableController);
                    break;
                case 13:
                    getAllTable(tableController);
                    break;
                case 14:
                    editedTable(tableController, chefController);
                    break;
                case 15:
                    removeTable(tableController);
                    break;
                case 16:
                    getAllWithChef(tableController);
                    break;
                case 17:
                    getAllWithOutChef(tableController);
                    break;
                case 18:
                    bookTable(tableController, chefController);
                    break;
                case 19:
                    order(dishController);
                    break;
                case 20:
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!");

            }
        } while (choose != 0);
    }

    public static void getAllChef(ChefController chefController) {

        if (chefController.getAll().isEmpty()) {
            System.out.println("Empty chef list");
        } else {
            chefController.getAll().forEach(System.out::println);
        }
    }

    public static void createdChef(ChefController chefController) {
        Scanner sc = new Scanner(System.in);
        Chef chef = new Chef();

        System.out.print("Id: ");
        chef.setId(sc.nextInt());
        inputChef(sc, chef);

        chefController.create(chef);
    }

    public static void inputChef(Scanner sc, Chef chef) {
        System.out.print("Name: ");
        chef.setName(sc.next());

        System.out.print("Phone: ");
        chef.setPhoneNumber(sc.next());

        System.out.print("Status: ");
        chef.setStatus(sc.nextBoolean());
    }

    public static void editedChef(ChefController chefController) {
        Scanner sc = new Scanner(System.in);
        Chef chef = new Chef();

        System.out.print("Enter chef id: ");
        int id = sc.nextInt();
        inputChef(sc, chef);

        chefController.update(id, chef);
    }

    public static void removeChef(ChefController chefController) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chef id: ");
        int id = sc.nextInt();
        chefController.remove(id);

    }

    public static void getAllChefByStatus(ChefController chefController) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter status (true/false): ");
        boolean status = sc.nextBoolean();

        if (chefController.getAllByStatus(status).isEmpty()) {
            System.out.println("Empty chef list");
        } else {
            chefController.getAllByStatus(status).forEach(System.out::println);
        }


    }

    public static void createdDish(DishController dishController) {
        Scanner sc = new Scanner(System.in);
        Dish dish = new Dish();

        System.out.print("Id: ");
        dish.setId(sc.nextInt());
        inputDish(sc, dish);

        dishController.create(dish);
    }

    public static void inputDish(Scanner sc, Dish dish) {
        System.out.print("Name: ");
        dish.setName(sc.next());

        System.out.print("Ingredient: ");
        dish.setIngredient(sc.next());

        System.out.print("Category: ");
        dish.setCategory(sc.next());

        System.out.print("Count: ");
        dish.setCount(sc.nextInt());
    }

    public static void getAllDish(DishController dishController) {
        if (dishController.getAll().isEmpty()) {
            System.out.println("Empty dish list");
        } else {
            dishController.getAll().forEach(System.out::println);
        }
    }

    public static void editedDish(DishController dishController) {
        Scanner sc = new Scanner(System.in);
        Dish dish = new Dish();

        System.out.print("Enter dish id: ");
        int id = sc.nextInt();
        inputDish(sc, dish);

        dishController.update(id, dish);
    }

    public static void removeDish(DishController dishController) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dish id: ");
        int id = sc.nextInt();
        dishController.remove(id);

    }

    public static void getAllByCategory(DishController dishController) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dish category: ");
        String cateSearch = sc.next();

        if (dishController.getAllByCategory(cateSearch).isEmpty()) {
            System.out.println("Empty dish list");
        } else {
            dishController.getAllByCategory(cateSearch).forEach(System.out::println);
        }
    }

    public static void getDishBestSeller(DishController dishController) {
        System.out.println(dishController.getBestSeller());
    }

    public static void createdTable(TableController tableController) {
        Scanner sc = new Scanner(System.in);
        Table table = new Table();

        System.out.print("Id: ");
        table.setId(sc.nextInt());

        System.out.print("Name: ");
        table.setName(sc.next());

        System.out.print("Guest name: ");
        table.setGuestName(sc.next());

        table.setChef(null);

        tableController.create(table);
    }

    public static void getAllTable(TableController tableController) {

        if (tableController.getAll().isEmpty()) {
            System.out.println("Empty table list");
        } else {
            tableController.getAll().forEach(System.out::println);
        }

    }

    public static void editedTable(TableController tableController, ChefController chefController) {
        Scanner sc = new Scanner(System.in);
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
    }


    public static void removeTable(TableController tableController) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table id: ");
        int id = sc.nextInt();
        tableController.remove(id);

    }

    public static void getAllWithChef(TableController tableController) {
        if (tableController.getAllWithChef().isEmpty()) {
            System.out.println("Empty table list");
        } else {
            tableController.getAllWithChef().forEach(System.out::println);
        }
    }

    public static void getAllWithOutChef(TableController tableController) {
        if (tableController.getAllWithOutChef().isEmpty()) {
            System.out.println("Empty table list");
        } else {
            tableController.getAllWithOutChef().forEach(System.out::println);
        }
    }

    public static void bookTable(TableController tableController, ChefController chefController) {
        Scanner sc = new Scanner(System.in);

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

    }

    public static void order(DishController dishController) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách món ăn: ");
        if (dishController.getAll().isEmpty()) {
            System.out.println("Empty dish list");
        } else {
            dishController.getAll().forEach(System.out::println);
        }

        System.out.print("Chọn id món ăn cần order: ");
        int idDish = sc.nextInt();

        System.out.println("Nhập số lượng: ");
        int quantityDish = sc.nextInt();

        dishController.order(idDish, quantityDish);
    }
}