package utils;

import entity.MonAn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileUtils {
    private String pathFileExport = "E:/CY_VietNam/Buoi4_QuanLy/DataOutPut.txt";
    private String pathFileImport = "E:/CY_VietNam/Buoi4_QuanLy/DataInput.txt";

    public void xuatThucDon(List<MonAn> monAns) throws IOException {
        try {
            File file = new File(pathFileExport);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (MonAn monAn : monAns) {
                bufferedWriter.write(monAn.getId() + "," + monAn.getName() + "," + monAn.getIngredients() + "," + monAn.getCategory() + "," + monAn.getCount());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Xay ra loi trong qua trinh xuat thuc don " + e.getMessage());
        }
    }

    public List<MonAn> nhapMon() throws IOException {
        List<MonAn> monAns = new ArrayList<>();
        try {
            File file = new File(pathFileImport);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                String[] phan = input.split(",");
                int id = Integer.parseInt(phan[0]);
                String name = phan[1];
                String ingredients = phan[2];
                String category = phan[3];
                int count = Integer.parseInt(phan[4]);
                MonAn monAn = new MonAn(id, name, ingredients, category, count);
                monAns.add(monAn);
            }
        } catch (Exception e) {
            System.out.println("Xay ra loi trong qua trinh nhap mon: " + e.getMessage());
        }
        return monAns;
    }
}
