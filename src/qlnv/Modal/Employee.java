package qlnv.Modal;

public class Employee {
    private Long id;
    private String name;
    private int age;
    private String DOB ;
    private String phoneNUmber;
    private String workAs;



    public Employee() {
    }

    public Employee(Long id, String name, int age, String DOB, String phoneNUmber, String workAs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.phoneNUmber = phoneNUmber;
        this.workAs = workAs;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getWorkAs() {
        return workAs;
    }

    public void setWorkAs(String workAs) {
        this.workAs = workAs;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", phoneNUmber='" + phoneNUmber + '\'' +
                ", workAs='" + workAs + '\'' +
                '}';
    }
}
