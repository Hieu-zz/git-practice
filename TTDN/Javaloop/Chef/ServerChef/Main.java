package Chef.ServerChef;

import Chef.ControllerChef.ChefManager;
import Chef.ControllerChef.DishManager;
import Chef.ControllerChef.TableManager;
import Chef.ModelChef.Table;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChefManager c = new ChefManager();
        DishManager d = new DishManager();
        TableManager t = new TableManager();
        do{
            System.out.println("----Menu-----");
            System.out.println("1. Thêm bếp trưởng");
            System.out.println("2. Danh sách bàn ăn");
            System.out.println("3. Thêm món ăn");
            System.out.println("4. Danh sách món ăn");
            System.out.println("5. Thêm bàn ăn");
            System.out.println("6. Danh sách bàn ăn");
            System.out.println("7. Sửa thông tin bếp trưởng");
            System.out.println("8. Sửa thông tin món ăn");
            System.out.println("9. Sửa thông tin bàn");
            System.out.println("10. Xóa bếp trưởng");
            System.out.println("11. Xóa món ăn");
            System.out.println("12. Xóa bàn");
            System.out.println("13. Món ăn cùng danh mục");
            System.out.println("14. Bàn ăn chưa có bếp trưởng");
            System.out.println("15. Danh sách bếp trưởng theo trạng thái");
            System.out.println("0. Thoát");
            System.out.println("---------------------------------------");

            System.out.println("Nhập lựa chọn");
            int opt = sc.nextInt();

            switch (opt){
                case 1:
                    c.crete();
                    break;
                case 2:
                    c.getAll();
                    break;
                case 3:
                    d.crete();
                    break;
                case 4:
                    d.getAll();
                    break;
                case 5:
                    t.crete();
                    break;
                case 6:
                    t.getAll();
                    break;
                case 7:
                    System.out.println("Nhập id muốn sửa: ");
                    int id1 = sc.nextInt();
                    c.update(id1);
                    break;
                case 8:
                    System.out.println("Nhập id muốn sửa: ");
                    int id2 = sc.nextInt();
                    d.update(id2);
                    break;
                case 9:
                    System.out.println("Nhập id muốn sửa: ");
                    int id3 = sc.nextInt();
                    t.update(id3);
                    break;
                case 10:
                    System.out.println("Nhập id muốn xóa: ");
                    int id4 = sc.nextInt();
                    c.delete(id4);
                    break;
                case 11:
                    System.out.println("Nhập id muốn xóa: ");
                    int id5 = sc.nextInt();
                    c.delete(id5);
                    break;
                case 12:
                    System.out.println("Nhập id muốn xóa: ");
                    int id6 = sc.nextInt();
                    c.delete(id6);
                    break;
                case 13:
                    d.getAllbyCategory();
                    break;
                case 14:
                    break;
                case 15:
                    System.out.println("Nhập trạng thái: ");
                    boolean a = sc.nextBoolean();
                    c.getAllbyStatus(a);
                    break;
                case 0:
                    System.out.println("Thoát menu!");
                    break;
            }
        }while (true);
    }
}
