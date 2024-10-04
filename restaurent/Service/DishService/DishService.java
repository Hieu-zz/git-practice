package restaurent.Service.DishService;

import restaurent.Model.Chef;
import restaurent.Model.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DishService implements IDishService{
    Scanner sc = new Scanner(System.in);
    List<Dish> dishes = new ArrayList<>();
    public DishService(){
        dishes.add(new Dish(1, 0, "Canh ca", "ca","Canh"));
        dishes.add(new Dish(2, 0, "Suon xao chua ngot", "suon","Xao"));
        dishes.add(new Dish(3, 0, "Canh bi do", "bi do","Canh"));
        dishes.add(new Dish(4, 0, "Thit kho", "thit","Kho"));
    }
    @Override
    public void getAllByCatergory() {
        List<Dish> dishes1 = new ArrayList<>();
        String cate = sc.nextLine();
        for (Dish dish : dishes){
            if (cate.equals(dish.getCategory())){
                dishes1.add(dish);
            }
        }
         for (Dish dish : dishes1){
             System.out.println(dish.toString());
         }
    }

    @Override
    public Objects getBestSeller() {
        return null;
    }

    @Override
    public void getAll() {
        for (Dish dish : dishes){
            System.out.println(dish.toString());
        }
    }

    public Dish getByID(int ID) {
        for(Dish dish :dishes){
            if(dish.getID() == ID){
                return dish;
            }
        }
        return null;
    }

    @Override
    public void create() {
       System.out.println("Moi nhap ID");
       int ID = sc.nextInt();
       System.out.println("Moi nhap ten mon");
       String name = sc.next();
       System.out.println("moi nhap nguyen lieu");
       String ingredient = sc.next();
       System.out.println("Moi nhap danh muc");
       String category = sc.next();
       Dish dish = new Dish(ID,0,name,ingredient,category);
       dishes.add(dish);
       getAll();

    }

    @Override
    public void update() {
        int ID = sc.nextInt();
        Dish dish = getByID(ID);
        System.out.println("Moi nhap ten mon");
        dish.setName(sc.next());
        System.out.println("moi nhap nguyen lieu");
        dish.setIngredient(sc.next());
        System.out.println("Moi nhap danh muc");
        dish.setCategory(sc.next());
        getAll();
    }

    @Override
    public void delete() {
        int ID = sc.nextInt();
        Dish dish = getByID(ID);
        dishes.remove(dish);
        getAll();
    }

    public void order(){
        System.out.println("Danh sach mon de goi");
        getAll();
        System.out.println("Moi chon mon- nhap id mon");
        int ID = sc.nextInt();
        Dish dish = getByID(ID);
        System.out.println("Moi nhap so luong mon");
        int count = sc.nextInt();
        count += dish.getCount();
        dish.setCount(count);
    }
}
