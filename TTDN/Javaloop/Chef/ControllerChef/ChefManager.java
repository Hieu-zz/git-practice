package Chef.ControllerChef;


import Chef.ModelChef.Chef;
import Chef.ModelChef.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ChefManager implements baseChefManager{
    List<Chef> chefList;

    public ChefManager() {
        this.chefList = new ArrayList<>();
        chefList.add(new Chef(1,"Lan","0122333",true));
        chefList.add(new Chef(2,"Ngoc","0224442",true));
        chefList.add(new Chef(1,"Phuong","0223311",false));
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void getAll() {
        for (Chef c : chefList){
            System.out.println(c.toString());
        }
    }

    @Override
    public Objects getById(int id) {
        return null;
    }
    public Chef GetById(int id) {
        for (Chef c: chefList){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    @Override
    public void crete() {
        System.out.println("Thêm thông tin đầu bếp");
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        System.out.println("Nhập name: ");
        String name = sc.next();
        System.out.println("Nhập phone number:");
        String phone = sc.next();
        System.out.println("Nhập trạng thái");
        boolean status = sc.nextBoolean();

        Chef c = new Chef(id,name,phone,status);
        chefList.add(c);
        System.out.println("Thêm bếp trưởng thành công");
    }

    @Override
    public void update(int id) {
        int count = 0;
        for (int i = 0;i<chefList.size();i++){
            if(chefList.get(i).getId() == id){
                count++;
                System.out.println("Nhap lại tên: ");
                chefList.get(i).setName(sc.next());
                System.out.println("Nhap lại SĐT: ");
                chefList.get(i).setPhoneNumber(sc.next());
                System.out.println("Nhap lại trạng thái: ");
                chefList.get(i).setStatus(sc.nextBoolean());
            }
        }
        if (count == 0){
            System.out.println("Ko tồn tại id này");
        }
        getAll();
    }

    @Override
    public void delete(int id) {
        chefList.remove(GetById(id));
        getAll();
    }

    @Override
    public void getAllbyStatus(boolean status) {
        List<Chef> listAction = new ArrayList<>();
        for (Chef c:chefList){
            if(c.isStatus() == status){
                listAction.add(c);
            }
        }
        for (Chef c: listAction){
            System.out.println(c.toString());
        }
    }

}