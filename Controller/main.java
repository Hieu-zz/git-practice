package Controller;

import Java_loop.SinhVien;
import Model.NhanVien;
import Model.Phong;
import Service.NhanVienService;
import Service.PhongService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Moi chon cac danh muc sau");
        System.out.println("1-Hien thi danh sach nhan vien");
        System.out.println("2-Them nhan vien");
        System.out.println("3-Sua nhan vien");
        System.out.println("4-Xoa nhan vien");
        System.out.println("5-Hien thi danh sach phong");
        System.out.println("6-Them phong");
        System.out.println("7-Sua phong");
        System.out.println("8-Xoa phong");
        System.out.println("9- Hien thi phong ban trong");
        System.out.println("10- Hien thi phong ban khong trong");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        long id;
        String name;
        NhanVienService nvs = new NhanVienService();
        PhongService ps = new PhongService();
        switch (choose){
            case 1 :{
                nvs.getAll();
                break;
            }
            case 2 :{
                NhanVien nv = new NhanVien();
                System.out.println("Moi nhap thong tin nhan vien");
                System.out.println("-------------------------");
                System.out.println("Moi nhap id");
                nv.setId(sc.nextLong());
                System.out.println("Moi nhap ten");
                nv.setName(sc.next());
                System.out.println("Moi nhap ngay sinh");
                nv.setDOB(sc.next());
                System.out.println("Moi nhap sdt");
                nv.setPhoneNumber(sc.next());
                System.out.println("Moi nhap cv");
                nv.setWorkAs(sc.next());
                System.out.println("Moi nhap tuoi");
                nv.setAge(sc.nextInt());
                nvs.add(nv);
                nvs.getAll();
                break;
            }
            case 3 :{
                System.out.println("Nhap id nhan vien muon thay doi");
                id = sc.nextLong();
                nvs.update(id);
                nvs.getAll();
                break;
            }
            case 4 :{
                System.out.println("Nhap id nhan vien muon xoa");
                id = sc.nextLong();
                nvs.delelte(id);
                nvs.getAll();
                System.out.println("Danh sach phong da cap nhat lai");
                ps.xoaNhanVienKhoiPhong(id);
                break;
            }
            case 5 :{
                ps.getAll();
                break;
            }
            case 6 :{
                Phong p = new Phong();
                System.out.println("Nhan vien chua co phong");
                ps.kiemTraNhanVienChuaCoPhong();
                System.out.println("Moi nhap thong tin phong");
                System.out.println("Moi nhap ten phong");
                p.setName(sc.next());
                System.out.println("Moi nhap tang");
                p.setFloor(sc.nextInt());
                ps.add(p);
                ps.getAll();
                break;
            }
            case 7 :{
                System.out.println("MOi nhap ten phong can sua");
                name = sc.next();
                ps.update(name);
                ps.getAll();
                break;
            }
            case 8 :{
                break;
            }
            case 9 :{
                ps.hienThiPhongTrong();
                break;
            }
            case 10 :{
                ps.hienThiPhongKhongTrong();
                break;
            }
            default:{
                System.out.println("Moi nhap lai lua chon");
                break;
            }
        }

    }
}
