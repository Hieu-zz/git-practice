package org.example.quanlynhahang.service.impl;

import org.example.quanlynhahang.models.Chef;
import org.example.quanlynhahang.service.IChefService;
import org.example.quanlynhanvien.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefService implements IChefService {
    static List<Chef> chefs = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    @Override
    public List<Chef> getAll() {
        if(chefs.isEmpty()){
            System.out.println("Khong co bep truong");
            return new ArrayList<>();
        }else{
            for(Chef chef:chefs){
                System.out.println(chef);
            }
        }
        return chefs;
    }

    @Override
    public Chef getById(int id) {
        for(Chef chef:chefs){
            if(chef.getId()==id){
                return chef;
            }
        }
        return null;
    }

    @Override
    public void create(Chef chef) {
        if(getById(chef.getId())==null){
            chefs.add(chef);
        }else{
            System.out.println("ID cua bep truong an da ton tai");
        }
    }

    @Override
    public void update() {
        System.out.println("Id cua bep truong muon cap nhat");
        int idChef = sc.nextInt();
        sc.nextLine();
        Chef c= getById(idChef);
        if(c!=null){
            System.out.println("Nhap ten moi cua bep truong");
            String name = sc.nextLine();
            c.setName(name);
            System.out.println("Nhap so dien thoai moi cua bep truong");
            String phone = sc.nextLine();
            c.setPhoneNumber(phone);
            System.out.println("Nhap trang thai moi cua bep truong");
            boolean status = sc.nextBoolean();
            c.setStatus(status);
            System.out.println("Cap nhat thong tin cua bep truong thanh cong");
        }else{
            System.out.println("Khong tim thay thong tin cua bep truong");
        }
    }

    @Override
    public void delete() {
        System.out.println("Id cua bep truong muon xoa");
        int idChef = sc.nextInt();
        sc.nextLine();
        Chef c= getById(idChef);
        if(c!=null){
            chefs.remove(c);
            System.out.println("Xoa bep truong thanh cong");
        }else {
            System.out.println("khong tim thay thong tin cua bep truong can xoa");
        }
    }

    @Override
    public Chef getChefByStatus(boolean status) {
        System.out.println("Danh sach bep truong theo trang thai");
        for (Chef chef:chefs){
            if(chef.status == status){
                System.out.println(chef);
            }
        }
        return null;
    }
}
