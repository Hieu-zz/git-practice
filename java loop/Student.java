import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private String lop;
    private int age;
    private String DOB;

    public Student() {
    }

    public Student(long id,String name, String className, int age, String DOB) {
        this.id=id;
        this.name = name;
        this.lop = className;
        this.age = age;
        this.DOB = DOB;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String className) {
        this.lop = className;
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

}
