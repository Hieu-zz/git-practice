package restaurent.Service.DishService;

import restaurent.Model.Dish;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DishService implements IDishService{
    Scanner sc = new Scanner(System.in);
    List<Dish> dishes = new ArrayList<>();
    public DishService(){
        dishes.add(new Dish(1, 1, "Canh ca", "ca","Canh"));
        dishes.add(new Dish(2, 0, "Suon xao chua ngot", "suon","Xao"));
        dishes.add(new Dish(3, 0, "Canh bi do", "bi do","Canh"));
        dishes.add(new Dish(4, 0, "Thit kho", "thit","Kho"));
    }
    @Override
    //lay mon an theo danh muc
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
    public Dish getBestSeller() {
        int IDMax = 0;
        int max = 0;
        for (Dish dish : dishes){
            if (dish.getCount() > max){
                max = dish.getCount();
                IDMax = dish.getID();
            }
        }
        Dish dish1 = getByID(IDMax);
        return dish1;
    }

    @Override
    //lay danh sach mon
    public void getAll() {
        for (Dish dish : dishes){
            System.out.println(dish.toString());
        }
    }

    //lay mon an theo id
    public Dish getByID(int ID) {
        for(Dish dish :dishes){
            if(dish.getID() == ID){
                return dish;
            }
        }
        return null;
    }

    @Override
    //tao mon
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
    //sua thong tin mon
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
    //xoa mon
    public void delete() {
        int ID = sc.nextInt();
        Dish dish = getByID(ID);
        dishes.remove(dish);
        getAll();
    }

    //goi mon
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
        System.out.println("Goi mon thanh cong");
        System.out.println("Khach hang goi mon: "+ dish+ " so luong: "+ count);
        getAll();
    }

    //in ra menu
    public void menu(){
        System.out.println("Moi nhap ten file");
        String nameFile = sc.nextLine();
        try {
            OutputStream os = new FileOutputStream("D:\\java_cy\\restaurent\\ultil\\"+nameFile);
            ObjectOutputStream oss = new ObjectOutputStream(os);
            oss.writeObject(dishes);
            oss.flush();
            oss.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //them mon tu file
    public void addDishFromFile(){
        try {
            File file = new File("D:\\java_cy\\restaurent\\ultil\\mon-an.txt");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            List<Dish> dishList =  (List<Dish>) ois.readObject();
            for (Dish dish: dishList){
                dishes.add(dish);
            }
            ois.close();
        }catch (Exception e){
           e.printStackTrace();
        }
        getAll();
    }
}
