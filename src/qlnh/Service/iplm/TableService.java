package qlnh.Service.iplm;

import qlnh.Modal.Chef;
import qlnh.Modal.Dish;
import qlnh.Modal.Table;
import qlnh.Service.ITable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableService implements ITable {
    List<Table> tableList = new ArrayList<>();




    public List<Table> tables() {
        List<Table> tables = new ArrayList<>();
        for (Table table1 : tableList) {
            if (table1.getChef() == null) {
                tables.add(table1);
                System.out.println(table1);
                System.out.println("ko có bếp trương nào");
            }
        }
        return tables;
    };
    public List<Table> tables1() {
        List<Table> tables1 = new ArrayList<>();
          for (Table table1 : tableList) {
            if (table1.getChef() != null) {
                tables1.add(table1);

            }
        }
        if(tables1.isEmpty()){
            System.out.println("ko có bàn ăn nào ko có bếp truởng phục vụ ");
        }
        return tables1;
    };







    public void display(){
        for (Table t: tableList
             ) {
            System.out.println(t);
        }
    }
    public TableService( ){
        tableList.add(new Table(1,"b1" ,"tuan",null));
        tableList.add(new Table(2,"b2" ,"duong",null));
        tableList.add(new Table(3,"b3" ,"quang",null));

    }


    @Override
    public List<Table> getAll() {
        return tableList;
    }

    @Override
    public Table getbyId(int id) {

        for (Table dish : tableList) {
            if (dish.getId() == id) {
                System.out.println(dish.getId() + " " + dish.getName() + " " + dish.getGuestNam() + " " + dish.getChef());
            }
        }
        return null;
    }

    @Override
    public void create(Table table) {
        this.tableList.add(table);
    }

    @Override
    public void update(Table table) {
        Table tableToUpdate = tableList.stream()
                .filter(e -> e.getId() == table.getId())
                .findFirst()
                .orElse(null);

            tableToUpdate.setName(table.getName());
            tableToUpdate.setGuestNam(table.getGuestNam());
            tableToUpdate.setChef(table.getChef());
            System.out.println("Cập nhật thành công!");


    }

    @Override
    public void delete(int id) {
        for (Table t : tableList
        ) {
            if (t.getId() == id) {
                tableList.remove(t);
                System.out.println("đã xóa thành công");
                break;
            }
        }

    }

}
