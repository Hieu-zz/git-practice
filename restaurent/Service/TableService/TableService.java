package restaurent.Service.TableService;

import restaurent.Model.Chef;
import restaurent.Model.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableService implements ITableSevice{
    Scanner sc = new Scanner(System.in);
    List<Table> tables = new ArrayList<>();
    public TableService(){
        tables.add(new Table(1,"ban 1", "Trung", new Chef(3, "Nguyen Van C","0929557338", true)));
        tables.add(new Table(2,"ban 2", "Vinh", null));
    }
    @Override
    public void getAll() {
        for (Table table :tables){
            System.out.println(table.toString());
        }
    }

    public Table getByID(int ID) {
        for (Table table : tables){
            if (table.getID() == ID){
                return  table;
            }
        }
        return null;
    }

    @Override
    public void create() {
        System.out.println("moi nhap ID");
        int ID = sc.nextInt();
        System.out.println("Moi nhap ten ban");
        String name = sc.next();
        System.out.println("Moi nhap ten khach hang");
        String guestName = sc.next();
        Table table = new Table(ID, name, guestName, null);
        tables.add(table);
        getAll();
    }

    @Override
    public void update() {
        int ID = sc.nextInt();
        Table table = getByID(ID);
        System.out.println("Moi nhap ten ban");
        table.setName(sc.next());
        System.out.println("Moi nhap ten khach hang");
        table.setGuestName(sc.next());
        getAll();
    }

    @Override
    public void delete() {
        int ID = sc.nextInt();
        Table table = getByID(ID);
        tables.remove(table);
        getAll();
    }

    @Override
    public void getAllWithChef() {
        List<Table> tables1 = new ArrayList<>();
        for (Table table :tables){
            if (table.getChef() != null ){
                tables1.add(table);
            }
        }
        for (Table table : tables1){
            System.out.println(table.toString());
        }
    }

    @Override
    public void getAllWithoutChef() {
        List<Table> tables1 = new ArrayList<>();
        for (Table table: tables1){
            if (table.getChef() == null ){
                tables1.add(table);
            }
        }
        for (Table table : tables1){
            System.out.println(table.toString());
        }
    }
}
