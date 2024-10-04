package controller;

import entity.MonAn;
import service.impl.MonAnService;

import java.util.List;

public class MonAnController {
    MonAnService monAnService = new MonAnService();

    public List<MonAn> getAllMonAn() {
        return monAnService.getAllMonAn();
    }

    public void addMonAn(MonAn monAn) {
        monAnService.addMonAn(monAn);
    }

    public MonAn getMonAnById(int id) {
        return monAnService.getMonAn(id);
    }

    public void updateMonAn(MonAn monAn, int id) {
        monAnService.updateMonAn(monAn, id);
    }

    public void deleteMonAn(int id) {
        monAnService.deleteMonAn(id);
    }

    public List<MonAn> getMonAnByDanhMuc(String danhMuc) {
        return monAnService.getAllByDanhMuc(danhMuc);
    }

    public MonAn getMonAnBanChayNhat() {
        return monAnService.getMonAnBanChayNhat();
    }

    public void goiMon(int idMonAn, int soLuong) {
        monAnService.goiMon(idMonAn, soLuong);
    }
}
