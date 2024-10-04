package service;

import entity.BepTruong;

import java.util.List;

public interface IBepTruongService {
    List<BepTruong> getAllBepTruong();

    void addBepTruong(BepTruong bepTruong);

    void updateBepTruong(BepTruong bepTruong, int id);

    void deleteBepTruong(int id);

    BepTruong getBepTruong(int id);

    List<BepTruong> getAllBepTruongByStatus(boolean status);
}
