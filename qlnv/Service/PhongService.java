package qlnv.Service;

import qlnv.Model.NhanVien;
import qlnv.Model.Phong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PhongService implements IPService {
    Scanner sc = new Scanner(System.in);
    NhanVienService nvs = new NhanVienService();
    List<Phong> phongs = new ArrayList<Phong>();
    public PhongService(){
        phongs.add(new Phong("A", 1));
        phongs.add(new Phong("B", 2));
        phongs.add(new Phong("C", 3,new NhanVien(3,"Nguyen Van C","1/3/2004","0929557338","dev",20)));

    }


    @Override
    public void getAll() {
        for(Phong i: phongs){
            System.out.println(i.toString());
        }
    }

    @Override
    public void add(Phong p) {
        phongs.add(p);
    }

    @Override
    public void update(String name) {
        for (Phong i : phongs){
            if (name.equals(i.getName())){
                System.out.println("Moi nhap thong tin phong");
                System.out.println("Moi nhap ten phong");
                i.setName(sc.next());
                System.out.println("Moi nhap tang");
                i.setFloor(sc.nextInt());
            }
        }
    }

    @Override
    public void delelte(long id) {

    }

    public void kiemTraNhanVienChuaCoPhong(){
        List<NhanVien> nv = new ArrayList<NhanVien>();
        for (Phong i : phongs){
            if (i.getEmployee() != null){
                nv.add(i.getEmployee());
            }
        }
        for (NhanVien i : nv){
            nvs.nhanViens.remove(i);
        }
        for(NhanVien i: nvs.nhanViens){
            System.out.println(i.toString());
        }
    }

    public void hienThiPhongTrong(){
        List<Phong> pt = new ArrayList<Phong>() ;
        for (Phong i : phongs){
            if(i.getEmployee() == null){
                pt.add(i);
            }
        }
        for(Phong i: pt){
            System.out.println(i.toString());
        }
    }

    public void hienThiPhongKhongTrong(){
        List<Phong> pkt = new ArrayList<Phong>();
        for (Phong i : phongs){
            if (i.getEmployee() != null){
                pkt.add(i);
            }
        }
        for(Phong i: pkt){
            System.out.println(i.toString());
        }
    }


    public void xoaNhanVienKhoiPhong(long id){
        for (Phong i : phongs){
            if (i.getEmployee() != null ){
                if (i.getEmployee().getId() == id){
                    i.setEmployee(null);
                }
            }
        }
        getAll();
    }
}
