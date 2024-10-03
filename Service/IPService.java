package Service;

import Model.NhanVien;
import Model.Phong;

public interface IPService {
    void getAll();
    void add(Phong p);
    void update(String name);
    void delelte(long id);
}
