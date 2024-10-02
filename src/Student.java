public class Student {
    private int id ;
    private String name ;
    private String className;
    private int age ;
    private String DOB;

    public Student() {
    }

    public Student(int id, String name, String className, int age, String DOB) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.age = age;
        this.DOB = DOB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                '}';
    }
}
