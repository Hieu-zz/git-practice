import javaloop.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Width: ");
        double width = scanner.nextDouble();
        System.out.println("Height: ");
        double height = scanner.nextDouble();
        double dienTich = width * height;
        double chuVi = (width + height) * 2;
        System.out.println("Dien tich nguyen la: " + (int) dienTich);
        System.out.println("Chu vi nguyen la: " + (int) chuVi);
        System.out.println("Dien tich thuc la:  " +  String.format("%.3f", dienTich));
        System.out.println("Chu vi thuc la: " +String.format("%.3f", chuVi)); */

//        FindMaxNumber findMaxNumber = new FindMaxNumber();
//        findMaxNumber.findMaxNumber();

//        MathNumber mathNumber = new MathNumber();
//        mathNumber.TinhGiaTri();

//        CheckKey checkKey = new CheckKey();
//        checkKey.findKey();
//
//        CheckDoiXung check = new CheckDoiXung();
//        check.check();


        SinhVienService sinhVienService = new SinhVienService();
        Scanner sc = new Scanner(System.in);

        int choose = 0;
        while (choose != 6) {
            System.out.println("========================MENU==========================");
            System.out.println("Choose feature: ");
            System.out.println("1.Get All");
            System.out.println("2.Get all with name or id");
            System.out.println("3.Create sinh vien");
            System.out.println("4.Update sinh vien");
            System.out.println("5.Delete sinh vien");
            System.out.println("6.Exit");
            System.out.println("=======================================================");
            System.out.print("Please enter your choice: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    getAll(sinhVienService);
                    break;
                case 2:
                    getAllWithNameOrID(sinhVienService);
                    break;
                case 3:
                    createSinhVien(sinhVienService);
                    break;
                case 4:
                    updateSinhVien(sinhVienService);
                    break;
                case 5:
                    deleteSinhVien(sinhVienService);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        }

    }

    public static void getAll(SinhVienService sinhVienService) {
        List<SinhVien> sinhVienList = sinhVienService.getAllSinhVien();
        sinhVienList.forEach(System.out::println);
    }

    public static void getAllWithNameOrID(SinhVienService sinhVienService) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the name:");
        String name = sc.next();
        System.out.println("Fill the id:");
        int id = sc.nextInt();
        List<SinhVien> sinhVienList = sinhVienService.getSinhVienByNameOrID(name.trim(), id);
        sinhVienList.forEach(System.out::println);
    }

    public static void createSinhVien(SinhVienService sinhVienService) {
        Scanner sc = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien();
        System.out.println("Name: ");
        sinhVien.setName(sc.next());
        System.out.println("Lop:");
        sinhVien.setLop(sc.next());
        System.out.println("Id: ");
        sinhVien.setId(sc.nextInt());
        System.out.println("Age: ");
        sinhVien.setAge(sc.nextInt());
        System.out.println("dob: ");
        sinhVien.setDob(sc.next());
        if (sinhVienService.getById(sinhVien.getId()) != null) {
            System.out.println("ID sinh vien existed");
        } else {
            sinhVienService.createSinhVien(sinhVien);
        }

    }

    public static void updateSinhVien(SinhVienService sinhVienService) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill id  to update: ");
        int id = sc.nextInt();
        System.out.println("Nhap thong tin sinh vien moi: ");
        SinhVien sinhVien = new SinhVien();
        System.out.println("Name: ");
        sinhVien.setName(sc.next());
        System.out.println("Lop:");
        sinhVien.setLop(sc.next());
        System.out.println("Age: ");
        sinhVien.setAge(sc.nextInt());
        System.out.println("dob: ");
        sinhVien.setDob(sc.next());

        if (sinhVienService.getById(sinhVien.getId()) == null) {
            System.out.println("Sinh vien not found");
        }
        sinhVienService.updateSinhVien(sinhVien, id);
        System.out.println("update successfully");
    }

    public static void deleteSinhVien(SinhVienService sinhVienService) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill id to delete: ");
        int idDelete = sc.nextInt();
        if (sinhVienService.getById(idDelete) == null) {
            System.out.println("Sinh vien not found");
        }
        sinhVienService.deleteSinhVien(idDelete);
    }

}