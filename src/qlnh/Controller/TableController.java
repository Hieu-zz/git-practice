package qlnh.Controller;

import qlnh.Modal.Chef;
import qlnh.Modal.Dish;
import qlnh.Modal.Table;
import qlnh.Service.iplm.ChefService;
import qlnh.Service.iplm.DishService;
import qlnh.Service.iplm.TableService;
import qlnh.Util.Menu;

import java.util.Scanner;

public class TableController {
    static Scanner scanner = new Scanner(System.in);
    public static TableService tableService = new TableService();
    public static DishService dishService = new DishService();
    public static ChefService chefService = new ChefService();
    public static Menu menu = new Menu();



    public static String main_menu() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn một trong các tùy chọn:");
            System.out.println("a. Table ");
            System.out.println("b. Dish ");
            System.out.println("c. Chef");
            System.out.println("h. Thoát");
            System.out.println("chọn chức năng sử dụng");
            String select = scanner.next();
            return select;
        };
    public static Chef showAddFormChef(){
        System.out.println("Thêm Chef :");

        System.out.println("nhập id");
        int id = scanner.nextInt();
        System.out.println("nhập name :");
        String name = scanner.next();
        System.out.println("nhập phone :");
        String phone = scanner.next();
        return new Chef(id,name, phone,false);
    }
    public static Table showAddForm(){
            System.out.println("Thêm bàn :");

            System.out.println("nhập id");
            int id = scanner.nextInt();
            System.out.println("nhập tên :");
            String name = scanner.next();
            System.out.println("nhập khách hàng :");
            String guestmMen = scanner.next();
            return new Table(id,name,guestmMen,null);
        }


        public static Dish showAddFormDish() {
            System.out.println("Thêm bàn :");

            System.out.println("Nhập id:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nhập tên:");
            String name = scanner.nextLine();

            System.out.println("Nhập ingredient:");
            String ingredient = scanner.nextLine();

            System.out.println("Nhập category:");
            String category = scanner.nextLine();

            int count = 0;
            int quantity = 0;

            Dish dish = new Dish(id, name, ingredient, category, count, quantity);
            return  dish;
        }

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            boolean check = true;
            while (check) {
                System.out.println("nhap lua chon");
                String select = main_menu();
                switch (select) {
                    case "a":
                        while (check){
                            System.out.println("Chọn một trong các tùy chọn:");
                            System.out.println("1. hiển thị danh sách bàn");
                            System.out.println("2. thêm");
                            System.out.println("3. update");
                            System.out.println("4.xóa");
                            System.out.println("5 . lấy theo id");
                            System.out.println("6.bàn ăn chưa có bếp trưởng phục vụ");
                            System.out.println("7.bàn ăn đã có phê trưởng phục vụ");


                            int option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    tableService.display();

                                    break;
                                case 2:
                                    tableService.create(showAddForm());

                                    break;
                                case 3:
                                    tableService.update(showAddForm());
                                    break;
                                case 4:
                                    System.out.println("nhập id cần xóa :");
                                    int id = scanner.nextInt();
                                    tableService.delete(id);
                                    break;
                                case 5:
                                    System.out.println("nhập id muốn lấy :");
                                    int id1 = scanner.nextInt();
                                    tableService.getbyId(id1);
                                    break;
                                case 6:
                                    tableService.tables();
                                    break;
                                case 7:
                                    tableService.tables1();
                                    break;
                                case 8:
                                    check = false;
                                    break;
                                default:
                                    System.out.println("Lựa chọn không hợp lệ!");
                            }
                        }
                        break;
//

                    case "b":
                        while (check){
                            System.out.println("Chọn một trong các tùy chọn:");
                            System.out.println("1. hiển thị danh món ăn");
                            System.out.println("2. thêm");
                            System.out.println("3. update");
                            System.out.println("4.xóa");
                            System.out.println("5 . lấy theo id");
                            System.out.println("6 . món n bán chạy nhất .");
                            System.out.println("7 . món ăn theo cate .");
                            System.out.println("8 . gọi món .");
                            System.out.println("9. xuất thức ăn ra file");
                            System.out.println("10. Lưu thức ăn ra file");

                            int option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    dishService.display();

                                    break;
                                case 2:
                                    dishService.create(showAddFormDish());

                                    break;
                                case 3:
                                    dishService.update(showAddFormDish());
                                    break;
                                case 4:
                                    System.out.println("nhập id cần xóa :");
                                    int id = scanner.nextInt();
                                    dishService.delete(id);

                                    break;
                                case 5:
                                    System.out.println("nhập id muốn lấy :");
                                    int id1 = scanner.nextInt();
                                    dishService.getbyId(id1 );
                                    break;
                                case 6:
                                    dishService.bestSeller();


                                    break;
                                case 7:
                                    System.out.println("nhập cate");
                                    String name = scanner.next();
                                    dishService.dishMain(name);

                                    break;
                                case 8:
                                    dishService.callDish();
                                    break;
                                case 9:
                                    dishService.memu();
                                    break;
                                case 10:
                                    dishService.importF();
                                    break;
                                case 11:
                                    check = false;
                                    break;
                                default:
                                    System.out.println("Lựa chọn không hợp lệ!");
                            }
                        }
                        break;

                    case "c":
                        while (check){
                            System.out.println("Chọn một trong các tùy chọn");
                            System.out.println("1. hiển thị danh sách bếp trưởng");
                            System.out.println("2. thêm");
                            System.out.println("3. update");
                            System.out.println("4.xóa");
                            System.out.println("5 . lấy theo id");

                            int option = scanner.nextInt();
                            switch (option) {
                                case 1:
                                    chefService.display();

                                    break;
                                case 2:
                                    chefService.create(showAddFormChef());

                                    break;
                                case 3:
                                    chefService.update(showAddFormChef());
                                    break;
                                case 4:
                                    System.out.println("nhập id cần xóa :");
                                    int id = scanner.nextInt();
                                    chefService.delete(id);


                                    break;
                                case 5:
                                    System.out.println("nhập id muốn lấy :");
                                    int id1 = scanner.nextInt();
                                    chefService.delete(id1);

                                    break;
                                case 6:
                                    chefService.chefFlowStatus();
                                    break;
                                case 7:
                                    check = false;
                                    break;
                                default:
                                    System.out.println("Lựa chọn không hợp lệ!");
                            }
                        }
                        break;

                    case "h":
                        check = false;
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");

                }
            }
    }
}
