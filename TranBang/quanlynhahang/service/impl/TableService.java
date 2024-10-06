package org.example.quanlynhahang.service.impl;

import org.example.quanlynhahang.models.Chef;
import org.example.quanlynhahang.models.Table;
import org.example.quanlynhahang.service.ITableService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableService implements ITableService {
    static List<Table> tables = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    @Override
    public List<Table> getAll() {
        if(tables.isEmpty()){
            System.out.println("kh co ban");
            return new ArrayList<>();
        }else{
            for(Table table:tables){
                System.out.println(table);
            }
        }
        return tables;
    }

    @Override
    public Table getById(int id) {
        for (Table table : tables){
            if(table.getID()==id){
                System.out.println(table);
            }
        }
        return null;
    }

    @Override
    public void create(Table table) {
        if(getById(table.getID())==null){
            tables.add(table);
        }else {
            System.out.println("Id ban nay da ton tai, khong duoc them");
        }
    }

    @Override
    public void update(Table table,int id) {
        Table table1 = getById(id);
        if(table1!=null){
            table1.setName(table.getName());
            table1.setGuestName(table.getGuestName());
            System.out.println("Cap nhat thong tin cua ban thanh cong");
        }else {
            System.out.println("Khong tim thay thong tin cua ban");
        }
    }

    @Override
    public void delete(int id) {
        Table table= getById(id);
        if(table!=null){
            tables.remove(table);
            System.out.println("Xoa thong tin ban thanh cong");
        }else {
            System.out.println("Khong tim thay thong tin cua ban");
        }
    }

    @Override
    public List<Table> getAllTableWithChef() {
        List<Table> t = new ArrayList<>();
        for(Table table:tables){
            if(table.getChef()!=null){
                t.add(table);
                System.out.println(t);
            }
        }
        return null;
    }

    @Override
    public List<Table> getAllTableWithoutChef() {
        List<Table> t1 = new ArrayList<>();
        for(Table table:tables){
            if(table.getChef()==null){
                t1.add(table);
            }
        }
        return null;
    }
}
