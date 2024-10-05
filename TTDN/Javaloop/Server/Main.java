package Server;

import Controller.EmployeeManagement;
import Controller.PhongManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EmployeeManagement e = new EmployeeManagement();
        PhongManagement p = new PhongManagement();
        do{
            System.out.println("----Menu----");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Sửa nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Hiển thị danh sách nhân viên");
            System.out.println("5.Thêm phòng");
            System.out.println("6.Sửa phòng");
            System.out.println("7.Xóa phòng");
            System.out.println("8.Hiển thị danh sách đã có phòng");
            System.out.println("9.Hiển thị danh sách nhân viên chưa có phòng");
            System.out.println("0.Thoát");

            System.out.println("-----------------------");

            System.out.println("Nhập lựa chọn:");
            int n = s.nextInt();

            switch (n){
                case 1:
                    try {
                        e.them();
                    }catch (Exception m){
                        System.out.println("Đã tồn tại ID");
                    }
                    break;
                case 2:
                    long id1 = s.nextLong();
                    System.out.println("Sửa thông tin");
                    e.sua(id1);
                    break;
                case 3:
                    System.out.println("Nhập id muốn xóa:");
                    long id2 = s.nextLong();
                    System.out.println("Xóa thông tin");
                    e.xoaNhanVien(id2);
                    p.xoaNV(id2);
                    break;
                case 4:
                    System.out.println("---- DSNV ----");
                    e.hienThiDS();
                    break;
                case 5:
                    p.them(e);
                    break;
                case 6:
                    String name1 = s.next();
                    System.out.println("Sửa thông tin");
                    p.suaP(name1);
                    break;
                case 7:
                    String name2 = s.next();
                    System.out.println("Sửa thông tin");
                    p.xoaP(name2);
                    break;
                case 8:
                    System.out.println("---- DSP ----");
                    p.hienThiDSP();
                    break;
                case 9:
                    p.hienThiPhongTrong();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình");
                    break;
            }
        }while (true);
    }
}
