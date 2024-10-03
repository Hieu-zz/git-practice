package Service;

import Model.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVienService  implements INVService {
    Scanner sc = new Scanner(System.in);
    List<NhanVien> nhanViens = new ArrayList<NhanVien>();
    public NhanVienService(){
        nhanViens.add(new NhanVien(1,"Nguyen Van A","1/1/2004","0929557336","dev",20));
        nhanViens.add(new NhanVien(2,"Nguyen Van B","1/2/2004","0929557337","dev",20));
        nhanViens.add(new NhanVien(3,"Nguyen Van C","1/3/2004","0929557338","dev",20));
    }

    public void getAll(){
        for(NhanVien i: nhanViens){
            System.out.println(i.toString());
        }
    }
    @Override
    public void add(NhanVien nv) {
        nhanViens.add(nv);
    }

    @Override
    public void update(long id) {
        for (NhanVien i : nhanViens){
            if (id == i.getId()){
                System.out.println("Moi nhap thong tin nhan vien");
                System.out.println("-------------------------");
                System.out.println("Moi nhap ten");
                i.setName(sc.next());
                System.out.println("Moi nhap ngay sinh");
                i.setDOB(sc.next());
                System.out.println("Moi nhap sdt");
                i.setPhoneNumber(sc.next());
                System.out.println("Moi nhap cv");
                i.setWorkAs(sc.next());
                System.out.println("Moi nhap tuoi");
                i.setAge(sc.nextInt());
            }
        }

    }

    @Override
    public void delelte(long id) {
        nhanViens.remove(timNV(id));
    }

    public NhanVien timNV(long id ){
        for (NhanVien i :nhanViens){
            if(i.getId() == id){
                return i;
            }
        }
        return null;
    }

}
