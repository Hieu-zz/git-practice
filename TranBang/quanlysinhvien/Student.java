package org.example;

public class Student {
    int id;
    String name;
    String classs;
    int age;
    String dob;

    public  Student(){

    }
    public Student(int id, String name, String classs, int age, String dob) {
        this.id=id;
        this.name = name;
        this.classs = classs;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                '}';
    }
}
