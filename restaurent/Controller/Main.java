package restaurent.Controller;

import restaurent.Service.ChefService.ChefService;
import restaurent.Service.DishService.DishService;
import restaurent.Service.TableService.TableService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChefService chefService = new ChefService();
        DishService dishService = new DishService();
        TableService tableService = new TableService();
        do{
            System.out.println("Danh sach lua chon");
            System.out.println("1- Hien thi danh sach bep truong");
            System.out.println("2- Them thong tin bep truong");
            System.out.println("3- Sua thong tin bep truong");
            System.out.println("4- Xoa thong tin bep truong");
            System.out.println("5- Hien thi danh sach mon");
            System.out.println("6- Them thong tin mon");
            System.out.println("7- Sua thong tin mon");
            System.out.println("8- Xoa thong tin mon");
            System.out.println("9- Hien thi danh sach ban");
            System.out.println("10- Them thong tin ban");
            System.out.println("11- Sua thong tin ban");
            System.out.println("12- Xoa thong tin ban");
            System.out.println("13- Hien thi mon an theo danh muc");
            System.out.println("14- Hien thi ban co bep truong phuc vu");
            System.out.println("15- Hien thi ban khong co bep truong phuc vu");
            System.out.println("16- Goi mon");
            System.out.println("0- De thoat");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    chefService.getAll();
                    break;
                case 2:
                    System.out.println("Moi nhap vao thong tin dau bep");
                    chefService.create();
                    break;
                case 3:
                    System.out.println("Moi nhap ID dau bep muon sua");
                    chefService.update();
                    break;
                case 4:
                    System.out.println("Moi nhap ID dau bep muon xoa");
                    chefService.delete();
                    break;
                case 5:
                    dishService.getAll();
                    break;
                case 6:
                    System.out.println("Moi nhap thong tin mon");
                    dishService.create();
                    break;
                case 7:
                    System.out.println("Moi nhap Id mon muon sua");
                    dishService.update();
                    break;
                case 8:
                    System.out.println("Moi nhap Id mon muon xoas");
                    dishService.delete();
                    break;
                case 9:
                    tableService.getAll();
                    break;
                case 10:
                    System.out.println("moi nhap thong tin ban");
                    tableService.create();
                    break;
                case 11:
                    System.out.println("Nhap Id ban can sua thong tin");
                    tableService.update();
                    break;
                case 12:
                    System.out.println("Nhap Id ban can xoa thong tin");
                    tableService.delete();
                    break;
                case 13:
                    System.out.println("Moi nhap danh muc mon");
                    dishService.getAllByCatergory();
                    break;
                case 14:
                    tableService.getAllWithChef();
                    break;
                case 15:
                    tableService.getAllWithoutChef();
                    break;
                case 16:

                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while (true);
    }
}
