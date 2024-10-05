package qlnh.Service.iplm;

import qlnh.Modal.Chef;
import qlnh.Service.IChef;

import java.util.ArrayList;
import java.util.List;

public class ChefService implements IChef {
    List<Chef> chefList = new ArrayList<>();
    public void display(){
        for (Chef t: chefList
        ) {
            System.out.println(t.toString());
        }
    }

    public ChefService() {
        chefList.add(new Chef(1,"duong","034142",false));
        chefList.add(new Chef(2,"tuan","42342",true));
        chefList.add(new Chef(3,"quang","655445",false));

    }
    public void chefFlowStatus(){
        for (Chef c: chefList
             ) {
            if(c.isStatus()){
                System.out.println("những bếp trưởng đã có bàn");
                System.out.println(c);

            }if(!c.isStatus()){
                System.out.println("những bếp trưởng chưa có bàn");
                System.out.println(c);
            }

        }
    }


    @Override
    public List<Chef> getAll() {
        return chefList;
    }

    @Override
    public Chef getbyId(int id) {
        for (Chef dish : chefList) {
            if (dish.getId() == id) {
                System.out.println(dish.getId() + " " + dish.getName() + " " + dish.getPhoneNumber() );
            }
        }
        return null;
    }

    @Override
    public void create(Chef chef) {
        chefList.add(chef);
    }

    @Override
    public void update(Chef chef) {
        Chef dish1 = chefList.stream()
                .filter(e -> e.getId() == chef.getId())
                .findFirst()
                .orElse(null);

        if (dish1 != null) {
            dish1.setName(dish1.getName());
            dish1.setPhoneNumber(dish1.getPhoneNumber());
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Bàn không tồn tại!");
        }
    }

    @Override
    public void delete(int id) {
        for (Chef t: chefList
        ) {
            if(t.getId()==id){
                chefList.remove(t);
                System.out.println("đã xóa thành công");
                break;
            }
        }
    }
}
