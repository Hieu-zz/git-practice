package Chef.ControllerChef;

import Chef.ModelChef.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DishManager implements baseDishManager{
    List<Dish> dishList;
    Scanner sc = new Scanner(System.in);
    public DishManager() {
        this.dishList = new ArrayList<>();
        dishList.add(new Dish(1,"Thịt kho","Thịt heo","Món chính",15));
        dishList.add(new Dish(2,"Cơm","Gạo","Món chính",5));
        dishList.add(new Dish(3,"Tiramisu","Sữa","Món tráng miệng",8));
        dishList.add(new Dish(4,"Súp bí đỏ","Bí đỏ","Món khai vị",2));
    }

    @Override
    public void getAll() {
        for (Dish d: dishList){
            System.out.println(d.toString());
        }
    }

    @Override
    public Objects getById(int id) {
        return null;
    }
    public Dish GetById(int id) {
        for (Dish d: dishList){
            if(d.getId() == id){
                return d;
            }
        }
        return null;
    }

    @Override
    public void crete() {
        System.out.println("Thêm món ăn");
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        System.out.println("Nhập name: ");
        String name = sc.next();
        System.out.println("Nhập thành phần:");
        String ingredrent = sc.next();
        System.out.println("Nhập danh mục");
        String category = sc.next();

        Dish d = new Dish(id,name,ingredrent,category,0);
        dishList.add(d);
        System.out.println("Thêm món ăn thành công");
    }

    @Override
    public void update(int id) {
        int count = 0;
        for (int i = 0;i<dishList.size();i++){
            if(dishList.get(i).getId() == id){
                count++;
                System.out.println("Nhap lại tên: ");
                dishList.get(i).setName(sc.next());
                System.out.println("Nhap lại nguyên liệu: ");
                dishList.get(i).setIngredents(sc.next());
                System.out.println("Nhap lại danh mục: ");
                dishList.get(i).setCategory(sc.next());
            }
        }
        if (count == 0){
            System.out.println("Ko tồn tại id này");
        }
        getAll();
    }

    @Override
    public void delete(int id) {
        dishList.remove(GetById(id));
        getAll();
    }

    @Override
    public void getAllbyCategory() {
        List<Dish> listDishCategory = new ArrayList<>();
        System.out.println("Nhập danh mục: ");
        String cate = sc.nextLine();
        for(Dish d : dishList){
            if(d.getCategory().equals(cate)){
                listDishCategory.add(d);
            }
       }
        for (Dish d1 : listDishCategory){
            System.out.println(d1.toString());
        }
    }
    @Override
    public Dish getBestseller() {
        for (Dish d : dishList){
        }
        return null;
    }

}
