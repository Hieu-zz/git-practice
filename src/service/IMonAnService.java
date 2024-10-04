package service;

import entity.MonAn;

import java.util.List;

public interface IMonAnService {
    List<MonAn> getAllMonAn();

    void addMonAn(MonAn monAn);

    void updateMonAn(MonAn monAn, int id);

    void deleteMonAn(int id);

    MonAn getMonAn(int id);

    List<MonAn> getAllByDanhMuc(String danhMuc);

    MonAn getMonAnBanChayNhat();
}
