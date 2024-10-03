package controller;

import entity.NhanVien;
import entity.Phong;
import service.impl.NhanVienService;

import java.util.List;

public class NhanVienController {
    NhanVienService nhanVienService = new NhanVienService();

    public List<NhanVien> getAllNhanVien() {
        return nhanVienService.getAllNhanViens();
    }

    public NhanVien getNhanVienById(int id) {
        return nhanVienService.getNhanVien(id);
    }

    public void updateNhanVien(NhanVien nhanVien, int id) {
        nhanVienService.updateNhanVien(nhanVien, id);
    }

    public void addNhanVien(NhanVien nhanVien) {
        nhanVienService.addNhanVien(nhanVien);
    }

    public void deleteNhanVien(int id) {
        nhanVienService.deleteNhanVien(id);
    }

    public List<NhanVien> getNhanVienChuaCoPhong(List<Phong> phongs) {
        return nhanVienService.getNhanVienChuaCoPhong(phongs);
    }



}
