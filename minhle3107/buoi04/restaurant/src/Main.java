import actions.ChefActions;
import actions.DishActions;
import actions.TableActions;
import controllers.ChefController;
import controllers.DishController;
import controllers.TableController;
import services.ChefServices;
import services.DishServices;
import services.TableServices;

import java.util.InputMismatchException;
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

        ChefActions chefActions = new ChefActions(chefController, sc);
        DishActions dishActions = new DishActions(dishController, sc);
        TableActions tableActions = new TableActions(tableController, chefController, sc);

        int choose = -1;

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
            try {
                choose = sc.nextInt();
                switch (choose) {
                    // sử dụng "enhanced switch" của java 12, không cần break!
                    case 1 -> chefActions.createdChef();
                    case 2 -> chefActions.getAllChef();
                    case 3 -> chefActions.editedChef();
                    case 4 -> chefActions.removeChef();
                    case 5 -> chefActions.getAllChefByStatus();
                    case 6 -> dishActions.createdDish();
                    case 7 -> dishActions.getAllDish();
                    case 8 -> dishActions.editedDish();
                    case 9 -> dishActions.removeDish();
                    case 10 -> dishActions.getAllByCategory();
                    case 11 -> dishActions.getDishBestSeller();
                    case 12 -> tableActions.createdTable();
                    case 13 -> tableActions.getAllTable();
                    case 14 -> tableActions.editedTable();
                    case 15 -> tableActions.removeTable();
                    case 16 -> tableActions.getAllWithChef();
                    case 17 -> tableActions.getAllWithOutChef();
                    case 18 -> tableActions.bookTable();
                    case 19 -> dishActions.order();
                    case 20 -> dishActions.exportDishes();
                    case 21 -> dishActions.importDishes();
                    case 0 -> System.out.println("Hẹn gặp lại");
                    default -> System.out.println("Vui lòng chọn lại!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ!");
                sc.next(); // Xóa đầu vào không hợp lệ
            }
        } while (choose != 0);
    }
}