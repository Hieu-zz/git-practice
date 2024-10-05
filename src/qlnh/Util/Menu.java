package qlnh.Util;

import qlnh.Modal.Dish;
import qlnh.Service.iplm.DishService;

import java.io.*;
import java.util.List;

public class Menu {
    public  String TEXT = "D:\\text.txt";
    public  String TEXT1 = "D:\\output.txt";



    public void exportMenuToFile(List<Dish> dishList) {
        try (FileWriter writer = new FileWriter(TEXT)) {
            for (Dish dish : dishList) {
                writer.write("ID: " + dish.getId() + ", Tên: " + dish.getName() + ", Nguyên liệu: " + dish.getIngredient() +
                        ", Danh mục: " + dish.getCategory() + ", Số lượng: " + dish.getQuantity() + "\n");
            }
            System.out.println("Thực đơn đã được xuất ra file " + TEXT);
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi ghi file: " + e.getMessage());
        }
    }
    public Dish importfromText(){

        try {

            FileReader fileReader = new FileReader(TEXT1);
            try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                Dish dish = null;
               String line ;
               while ((line = bufferedReader.readLine()) != null){
                   String[] a = line.split(",");
                   int id = Integer.parseInt(a[0]);
                   String name = a[1];
                   String nl = a[2];
                   String cate = a[3];
                   int cout = Integer.parseInt(a[4]);
                   int quantity = Integer.parseInt(a[5]);
                   dish = new Dish(id,name,nl,cate,cout,quantity);
                   return dish;

               }

            }catch (Exception e){

            }
        }catch (Exception e){

        }
        return null;
    }




}
