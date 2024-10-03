package service;

import entity.NhanVien;

import java.util.List;

public interface INhanVienService {
    List<NhanVien> getAllNhanViens();

    NhanVien getNhanVien(int id);

    void addNhanVien(NhanVien nhanVien);

    void updateNhanVien(NhanVien nhanVien, int id);

    void deleteNhanVien(int id);
}
