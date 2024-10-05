package Chef.ControllerChef;

import Chef.ModelChef.Chef;
import Chef.ModelChef.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TableManager implements baseTableManger{
    List<Table> tableList;
    Scanner sc = new Scanner(System.in);
    public TableManager() {
        this.tableList = new ArrayList<>();
        tableList.add(new Table(1,"01","Ngân",null));
    }
    @Override
    public void getAll() {
        for (Table t : tableList){
            System.out.println(t.toString());
        }
    }

    @Override
    public Objects getById(int id) {
        return null;
    }
    public Table GetById(int id) {
        for (Table t: tableList){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    @Override
    public void crete() {
        System.out.println("Thêm bàn");
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên bàn: ");
        String name = sc.next();
        System.out.println("Nhập tên khách:");
        String guestname = sc.next();

        Table t = new Table(id,name,guestname,null);
        tableList.add(t);
        System.out.println("Thêm bếp trưởng thành công");
    }

    @Override
    public void update(int id) {
        int count = 0;
        for (int i = 0;i<tableList.size();i++){
            if(tableList.get(i).getId() == id){
                count++;
                System.out.println("Nhap lại tên: ");
                tableList.get(i).setName(sc.next());
                System.out.println("Nhap lại tên khách: ");
                tableList.get(i).setGuestName(sc.next());
            }
        }
        if (count == 0){
            System.out.println("Ko tồn tại id này");
        }
        getAll();
    }

    @Override
    public void delete(int id) {
        tableList.remove(GetById(id));
        getAll();
    }

    @Override
    public List<Objects> getAllWithChef() {

        return null;
    }

    @Override
    public List<Objects> getAllWithoutChef() {
        return null;
    }
    public List<Table> noHasChef(){
        List<Table> listNoHasDish = new ArrayList<>();
        for (Table t : tableList){
            if(t.getChef().equals(null)){
                listNoHasDish.add(t);
            }
        }
        return listNoHasDish;
    }

    public void addChef(Chef chef){

    }
}
