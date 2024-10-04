package service.impl;

import entity.MonAn;
import service.IMonAnService;

import java.util.ArrayList;
import java.util.List;

public class MonAnService implements IMonAnService {
    List<MonAn> monAns = new ArrayList<>();

    public MonAnService() {
        monAns.add(new MonAn(1, "Bread", "Rice", "Ngot", 0));
        monAns.add(new MonAn(2, "Noodle", "Egg", "Man", 0));
        monAns.add(new MonAn(3, "Cake", "Beef", "Chua", 0));
        monAns.add(new MonAn(4, "Candy", "Rice", "Ngot", 0));
        monAns.add(new MonAn(5, "Sandwich", "Egg", "Man", 0));
    }

    @Override
    public List<MonAn> getAllMonAn() {
        return monAns;
    }

    @Override
    public void addMonAn(MonAn monAn) {
        monAns.add(monAn);
    }

    @Override
    public void updateMonAn(MonAn monAnUpdate, int id) {
        MonAn monAn = getMonAn(id);
        if (monAn != null) {
            monAn.setCategory(monAnUpdate.getCategory());
            monAn.setName(monAnUpdate.getName());
            monAn.setCount(monAnUpdate.getCount());
            monAn.setIngredients(monAnUpdate.getIngredients());
        } else {
            System.out.println("Mon an not found");
        }
    }

    @Override
    public void deleteMonAn(int id) {
        MonAn monAn = getMonAn(id);
        if (monAn != null) {
            monAns.remove(monAn);
            System.out.println("Xoa thanh cong mon an");
        } else {
            System.out.println("Mon an not found");
        }
    }

    @Override
    public MonAn getMonAn(int id) {
        for (MonAn monAn : monAns) {
            if (monAn.getId() == id) {
                return monAn;
            }
        }
        return null;
    }

    @Override
    public List<MonAn> getAllByDanhMuc(String danhMuc) {
        List<MonAn> monAnTheoDanhMuc = new ArrayList<>();
        for (MonAn monAn : monAns) {
            if (monAn.getCategory().toLowerCase().contains(danhMuc.toLowerCase())) {
                monAnTheoDanhMuc.add(monAn);
            }
        }
        return monAnTheoDanhMuc;
    }

    @Override
    public MonAn getMonAnBanChayNhat() {
        MonAn monAnChayNhat = new MonAn();
        for (MonAn monAn : monAns) {
            if (monAn.getCount() > monAnChayNhat.getCount()) {
                monAnChayNhat = monAn;
            }
        }
        return monAnChayNhat;
    }


    public void goiMon(int idMonAn, int soLuong) {
        MonAn monAn = getMonAn(idMonAn);
        monAn.setCount(monAn.getCount() + soLuong);
        System.out.println("Goi mon thanh cong");
    }
}
