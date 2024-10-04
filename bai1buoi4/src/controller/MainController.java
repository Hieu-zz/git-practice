package controller;

import model.Chef;
import model.Dish;
import model.Table;
import service.ChefService;
import service.DishService;
import service.TableService;
import service.impl.ChefServiceImplement;
import service.impl.DishServiceImplement;
import service.impl.TableServiceImplement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static ChefService chefService = new ChefServiceImplement();
    static DishService dishService;

    static {
        try {
            dishService = new DishServiceImplement();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static TableService tableService = new TableServiceImplement();
    static Dish inputDish(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập id:");
        int id=sc.nextInt();sc.nextLine();
        System.out.println("Nhập tên món ăn:");
        String name=sc.nextLine();
        System.out.println("Nhập nguyên liệu:");
        String ingredient=sc.nextLine();
        System.out.println("Nhập tên danh mục:");
        String category=sc.nextLine();
        Dish dish=new Dish();
        dish.setId(id);
        dish.setName(name);
        dish.setIngredients(ingredient);
        dish.setCategory(category);
        return dish;
    }
    static Chef inputChef(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập id:");
        int id=sc.nextInt();sc.nextLine();
        System.out.println("Nhập tên đầu bếp:");
        String name=sc.nextLine();
        System.out.println("Nhập số điện thoại:");
        String phoneNumber=sc.nextLine();
        Chef chef=new Chef();
        chef.setId(id);
        chef.setPhoneNumber(phoneNumber);
        chef.setName(name);
        return chef;
    }
    static Table inputTable(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập id:");
        int id=sc.nextInt();sc.nextLine();
        System.out.println("Nhập vào tên bàn:");
        String name=sc.nextLine();
        System.out.println("Nhập vào tên khách hàng:");
        String guestName=sc.nextLine();
        Table table=new Table();
        table.setId(id);
        table.setName(name);
        table.setGuestName(guestName);
        return table;
    }
    static int menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Chọn hành động:");
        System.out.println("1.Thực đơn");
        System.out.println("2.Quản lí bàn");
        System.out.println("3.Quản lí bếp trưởng");
        int select=sc.nextInt();sc.nextLine();
        return select;
    }
    static int menu1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Xem thực đơn");
        System.out.println("2.Xóa món ăn");
        System.out.println("3.Cập nhật món ăn");
        System.out.println("4.Thêm món ăn");
        System.out.println("5.Gọi món");
        System.out.println("6.Xuất thực đơn ra file");
        int select=sc.nextInt();sc.nextLine();
        return select;
    }
    static int menu2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Xem tất cả các bàn còn trống");
        System.out.println("2.Xem tất cả bàn ăn đã có bếp trưởng phục vụ");
        System.out.println("3.Thêm bàn mới");
        System.out.println("4.Xóa bàn");
        System.out.println("5.Sửa bàn");
        System.out.println("6.Điều bếp trưởng");
        int select=sc.nextInt();sc.nextLine();
        return select;
    }
    static int menu3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Xem tất cả các bếp trưởng");
        System.out.println("2.Xóa bếp trưởng");
        System.out.println("3.Cập nhật thông tin");
        System.out.println("4.Thêm mới bếp trưởng");
        int select=sc.nextInt();sc.nextLine();
        return select;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        boolean check0=true;
        boolean check1=true;
        boolean check2=true;
        boolean check3=true;
        while(check0){
            switch (menu()){
                case 1:
                    while(check1){
                        switch (menu1()){
                            case 1:
                                for(Dish dish:dishService.getAll()){
                                    System.out.println("Id: "+dish.getId()
                                    +" Tên món: "+dish.getName()
                                    +" Nguyên liệu: "+dish.getIngredients()
                                    +" Danh mục: "+dish.getCategory()
                                    +" Đã bán: "+dish.getCount());
                                }
                                break;
                            case 2:
                                System.out.println("Chọn món ăn muốn xóa: ");
                                int dishId=sc.nextInt();sc.nextLine();
                                dishService.delete(dishId);
                                dishService.xuatThucDon();
                                break;
                            case 3:
                                dishService.update(inputDish());
                                System.out.println("Bạn có muốn cập nhật thực đơn không: 1. Có 2. Không");
                                int sl=sc.nextInt();sc.nextLine();
                                if(sl==1){
                                    dishService.xuatThucDon();
                                }
                                break;
                            case 4:
                                dishService.create(inputDish());
                                System.out.println("Bạn có muốn cập nhật thực đơn không: 1. Có 2. Không");
                                int sl1=sc.nextInt();sc.nextLine();
                                if(sl1==1){
                                    dishService.xuatThucDon();
                                }
                                break;
                            case 5:
                                System.out.println("Chọn món ăn:");
                                for(Dish dish:dishService.getAll()){
                                    System.out.println("Id: "+dish.getId()
                                            +" Tên món: "+dish.getName()
                                            +" Nguyên liệu: "+dish.getIngredients()
                                            +" Danh mục: "+dish.getCategory());
                                }
                                int dishId1=sc.nextInt();sc.nextLine();
                                System.out.println("Nhập số lượng:");
                                int quantity=sc.nextInt();sc.nextLine();
                                dishService.order(dishId1,quantity);
                                break;
                            case 6:
                                System.out.println("Đã xuất file");
                                dishService.xuatThucDon();
                                break;
                            default:
                                check1=false;
                        }
                    }
                    check1=true;
                    break;
                case 2:
                    while(check2){
                        switch (menu2()){
                            case 1:
                                for(Table table: tableService.getAllWithoutChef()){
                                    System.out.println("Id: "+table.getId()
                                    +" Tên bàn: "+table.getName()
                                    +" Tên khách hàng: "+table.getGuestName()
                                    );
                                    if(table.getChef()!=null){
                                        System.out.println("Bếp trưởng: "+table.getChef().getName());
                                    }else{
                                        System.out.println("Chưa có người phục vụ");
                                    }
                                }
                                break;
                            case 2:
                                for(Table table1: tableService.getAllWithChef()){
                                    System.out.println("Id: "+table1.getId()
                                            +" Tên bàn: "+table1.getName()
                                            +" Tên khách hàng: "+table1.getGuestName()
                                            +" Bếp trưởng: "+table1.getChef().getName()
                                    );
                                }
                                break;
                            case 3:
                                tableService.create(inputTable());
                                break;
                            case 4:
                                System.out.println("Nhập id bàn muốn xóa: ");
                                int tableId=sc.nextInt();sc.nextLine();
                                tableService.delete(tableId);
                                break;
                            case 5:
                                tableService.update(inputTable());
                                break;
                            case 6:
                                for(Table table: tableService.getAllWithoutChef()){
                                    System.out.println("Id: "+table.getId()
                                            +" Tên bàn: "+table.getName()
                                            +" Tên khách hàng: "+table.getGuestName()
                                    );
                                }
                                System.out.println("Chọn bàn:");
                                int tableId1=sc.nextInt();sc.nextLine();
                                for(Chef chef: chefService.getAllByStatus(true)){
                                    System.out.println("Id: "+chef.getId()
                                            +" Tên: "+chef.getName()
                                            +" Số điện thoại: "+chef.getPhoneNumber());
                                }
                                System.out.println("Chọn bếp trưởng:");
                                int chefId1=sc.nextInt();sc.nextLine();
                                chefService.getById(chefId1).setStatus(false);
                                tableService.phan_cong(tableId1,chefService.getById(chefId1));
                                break;
                            default:
                                check2=false;
                        }
                    }
                    check2=true;
                case 3:
                    while(check3){
                        switch(menu3()){
                            case 1:
                                for(Chef chef: chefService.getAll()){
                                    System.out.println("Id: "+chef.getId()
                                    +" Tên: "+chef.getName()
                                    +" Số điện thoại: "+chef.getPhoneNumber());
                                    if(!chef.getStatus()){
                                        System.out.println("Trạng thái: Đang phục vụ");
                                    }else{
                                        System.out.println("Trạng thái: Đang rảnh");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Nhập id bếp trưởng muốn xóa: ");
                                int chefId=sc.nextInt();sc.nextLine();
                                chefService.delete(chefId);
                                break;
                            case 3:
                                chefService.update(inputChef());
                                break;
                            case 4:
                                chefService.create(inputChef());
                                break;
                            default:
                                check3=false;
                        }
                    }
                    check3=true;
                default:
                    check0=false;
            }
        }
    }
}
