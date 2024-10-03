package qlnv.Service;

import qlnv.Model.Phong;

public interface IPService {
    void getAll();
    void add(Phong p);
    void update(String name);
    void delelte(long id);
}
