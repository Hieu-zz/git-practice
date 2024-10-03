package controller;

import entity.NhanVien;
import entity.Phong;
import service.impl.PhongService;

import java.util.List;

public class PhongController {
    PhongService phongService = new PhongService();

    public List<Phong> getAllPhong() {
        return phongService.getAllPhongs();
    }

    public Phong getPhongById(int id) {
        return phongService.getPhong(id);
    }

    public void updatePhong(Phong p, int id) {
        phongService.updatePhong(p, id);
    }

    public void addPhong(Phong p) {
        phongService.addPhong(p);
    }

    public void deletePhong(int id) {
        phongService.deletePhong(id);
    }

    public List<Phong> getPhongTrong() {
        return phongService.getPhongTrong();
    }

    public List<Phong> getPhongNotTrong() {
        return phongService.getPhongNotTrong();
    }

    public void updatePhongAfterDeleteNhanVien(int idNhanVien) {
        phongService.updatePhongAfterDeleteNhanVien(idNhanVien);
    }

    public void checkoutPhong(int idPhong) {
        phongService.checkOutPhong(idPhong);
    }

    public void addNhanVienToPhong(int idPhong, NhanVien nhanVien) {
        phongService.addNhanVienToPhong(idPhong, nhanVien);
    }
}
