package Service;

import Model.NhanVien;

public interface INVService {
    void getAll();
    void add(NhanVien nv);
    void update(long id);

    void delelte(long id);
}
