package util;

import model.Dish;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileAction {
    public final String thucdon = "D:\\thực đơn.txt";
    public final String columns = "Id---Tên món---Nguyên liệu---Danh mục---Đã bán";

    public void writeFile(List<Dish> dishList) throws IOException {
        FileWriter writer= new FileWriter(thucdon);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        for(Dish dish:dishList) {
            bufferedWriter.write(dish.getId() + "---" + dish.getName() + "---" + dish.getIngredients() + "---" + dish.getCategory() + "---" + dish.getCount() + "\n");
        }
            bufferedWriter.close();
    }

    public List<Dish> readFile() throws IOException {
        FileReader fileReader = new FileReader(thucdon);
        BufferedReader reader = new BufferedReader(fileReader);
        List<Dish>dishList=new ArrayList<>();
        try{
        String s;
        //định dạng:ID---Tên món---Nguyên liệu---Danh mục---Đã bán
        while ((s=reader.readLine()) != null) {
                Dish dish=new Dish();
                String[]contents=s.split("---");
                dish.setId(Integer.parseInt(contents[0]));
                dish.setName(contents[1]);
                dish.setIngredients(contents[2]);
                dish.setCategory(contents[3]);
                dishList.add(dish);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        reader.close();
        return dishList;
    }
}
