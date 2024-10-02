import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        do{
            System.out.println("-----------Menu-----------");
            System.out.println("1. Them SV");
            System.out.println("2. Lấy theo name");
            System.out.println("3. Lấy theo id");
            System.out.println("4. Hien DSSV");
            System.out.println("5. Sửa SV");
            System.out.println("6. Xóa SV");
            System.out.println("7. Thoát");
            Scanner s = new Scanner(System.in);
            int opt = s.nextInt();
            switch (opt) {
                case 1:
                    qlsv.nhapTT();
                    break;
                case 2:
                    String name = s.next();
                    qlsv.timTen(name);
                    break;
                case 3:
                    String id = s.next();
                    qlsv.timId(id);
                    break;
                case 4:
                    qlsv.hienThiDS();
                    break;
                case 5:
                    System.out.println("Nhập id sv can sua: ");
                    String id3 = s.next();
                    qlsv.suaTT(id3);
                    break;
                case 6:
                    System.out.println("Nhập id cần xóa:");
                    String id2 = s.next();
                    qlsv.listSV.removeIf(sinhVien -> sinhVien.getId().equalsIgnoreCase(id2));
                    break;
                case 7:
                    break;

            }
        } while (true);

    }
}
