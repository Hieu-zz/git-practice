package service;

import entity.Phong;

import java.util.List;

public interface IPhongService {
    List<Phong> getAllPhongs();

    void addPhong(Phong phong);

    void updatePhong(Phong phong, int id);

    void deletePhong(int id);

    Phong getPhong(int id);
}
