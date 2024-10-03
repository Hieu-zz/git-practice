package service;

import entity.LichSu;
import entity.NhanVien;
import entity.Phong;

import java.util.List;

public interface ILichSuService {
    List<LichSu> getAlls();

    void add(Phong phong,NhanVien nhanVien);
}
