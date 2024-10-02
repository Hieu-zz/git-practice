import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSV {
    ArrayList<sinhVien> listSV;
    Scanner s = new Scanner(System.in);
    public QLSV() {
        listSV = new ArrayList<>();
    }

    public void ThemSV(sinhVien sv) {
        listSV.add(sv);
    }

    public void nhapTT() {
        sinhVien sv;
        System.out.println("Số lượng sinh viên: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập TT sinh viên "+(i+1));
            sv = new sinhVien();
            sv.nhapTTSV();
            ThemSV(sv);
        }
    }

    public void hienThiDS() {
        int i = 1;
        for (sinhVien sv : listSV) {
            System.out.println("-------Thông tin SV-------");
            sv.HienThi();
            i++;
        }
    }

    public void timTen(String name) {
        for (sinhVien sv : listSV) {
            if (sv.name.equals(name)) {
                sv.HienThi();
            }
        }
    }

    public void timId(String id) {
        for (sinhVien sv : listSV) {
            if (sv.id.equals(id)) {
                sv.HienThi();
            }
        }
    }

    public void suaTT(String id){
        boolean isCheck = false;
        for (int i = 0; i < listSV.size(); i++) {
            if(listSV.get(i).getId().equals(id)){
                isCheck = true;
                listSV.get(i).setName(s.next());
                listSV.get(i).setSex(s.next());
                listSV.get(i).setAge(s.nextInt());
                listSV.get(i).setDOB(s.next());

            }
        }
        if(!isCheck){
            System.out.println("Sinh viên không tồn tại");
        }
    }

    public void xoaSV(String id){
        for (sinhVien sv:listSV){
            if(sv.id.equals(id)){
                listSV.remove(sv);
            }
        }
    }
}
