package qlnh.Service.iplm;

import qlnh.Modal.Dish;
import qlnh.Modal.Table;
import qlnh.Service.IDishService;
import qlnh.Util.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DishService implements IDishService {
    Scanner scanner = new Scanner(System.in);
    List<Dish> dishList = new ArrayList<>();
    Menu menu = new Menu();

    public void importF(){
        create(menu.importfromText());
        System.out.println("đã lưu thành công");
    }
    public void memu(){
        menu.exportMenuToFile(getAll());
    }
    int count = 0;
    int quantity = 0;

    public void display(){
        for (Dish t: dishList
        ) {
            System.out.println(t.toString());
        }
    }
    public void callDish(){
        System.out.println("danh sách món ăn :");
        display();
        System.out.println("khách hàng gọi món ăn :");
        int id = scanner.nextInt();
        Dish dish = getbyId(id);

        System.out.println("so luong :");
        int number = scanner.nextInt();
        dish.setCount(dish.getCount()+number);
        System.out.println("đã gọi thành cong món ăn");

    }

    public DishService() {
        dishList.add(new Dish(1,"ca","com","a",count,quantity));
        dishList.add(new Dish(2,"canh","com","b", count ,quantity));
        dishList.add(new Dish(2,"canh","com","name", 3 ,quantity));
        dishList.add(new Dish(2,"canh","com","name", 3 ,quantity));
    }
    public void dishMain(String name){
        List<Dish> a = new ArrayList<>();
        for (Dish d : dishList) {
            if(d.getCategory().equals(name)){
                System.out.println(d);
            }
        }
    }
    public void bestSeller(){
        List<Dish> dishes = new ArrayList<>();
        int a = 0;
        for ( Dish d : dishList
             ) {
            if( d.getCount()>a){
                a = d.getCount();
                dishes.add(d);
            }
            for (Dish e: dishes
                 ) {
                System.out.println(e);
            }
        }
    };
    public Dish best(){
        Dish dish = new Dish();
        for (Dish d: dishList
             ) {
            if(dish.getCount() < d.getCount()){
                dish = d;
            }
        }
        return null;
    }

    @Override
    public List<Dish> getAll() {
        return dishList;
    }

    @Override
    public Dish getbyId(int id) {
        for (Dish dish : dishList) {
            if (dish.getId() == id) {
                System.out.println(dish.getId() + " " + dish.getName() + " " + dish.getIngredient() + " " + dish.getCategory());
                return dish;
            }
        }
        return null;
    }

    @Override
    public void create(Dish dish) {
        dishList.add(dish);
    }

    @Override
    public void update(Dish dish) {
        Dish dish1 = dishList.stream()
                .filter(e -> e.getId() == dish.getId())
                .findFirst()
                .orElse(null);

        if (dish1 != null) {
            dish1.setName(dish1.getName());
            dish1.setCategory(dish1.getCategory());
            dish1.setIngredient(dish1.getIngredient());
            dish1.setCount(dish1.getCount());
            dish1.setQuantity(dish1.getQuantity());
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Bàn không tồn tại!");
        }
    }

    @Override
    public void delete(int id) {
        for (Dish t: dishList
        ) {
            if(t.getId()==id){
                dishList.remove(t);
                System.out.println("đã xóa thành công");
                break;
            }
        }
    }
}
