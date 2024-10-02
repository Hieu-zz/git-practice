import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class sinhVien {
    String id;
    String name;
    String sex;
    int age;
    String DOB;

    public sinhVien() {
    }

    public sinhVien(String id, String name, String sex, int age, String DOB) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.DOB = DOB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "demo5{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                '}';
    }

    public void nhapTTSV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        id = sc.next();
        System.out.print("Nhập name: ");
        name = sc.next();
        System.out.print("Nhập sex: ");
        sex = sc.next();
        System.out.print("Nhập age: ");
        age = sc.nextInt();
        System.out.print("Nhập DOB: ");
        DOB = sc.next();
    }

    public void HienThi(){
        System.out.println("Id: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Sex: "+ sex);
        System.out.println("Age: "+ age);
        System.out.println("DOB: "+ DOB);

    }
}
