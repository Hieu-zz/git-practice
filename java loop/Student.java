import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private String lop;
    private int age;
    private String DOB;
    private static List<Student> studentList=new ArrayList<>();

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
    public String toString(Student student){
        return "Id: "+student.getId()+" Ten: "+student.getName()+" Tuoi: "+student.getAge()+" Lop: "+student.getLop()+" Ngay sinh: "+student.getDOB();
    }
    public void insert(Student student){
        studentList.add(student);
    }
    public List<Student> getAll(){
        return studentList;
    }
    public Student getById(long id){
        Student student=studentList.stream().filter(x->x.id==id).toList().get(0);
        return student;
    }
    public void update(long id,Student new_student){
        Student selected_student= studentList.stream().filter(x->x.id==id).toList().get(0);
        selected_student.setName(new_student.getName());
        selected_student.setAge(new_student.getAge());
        selected_student.setLop(new_student.getLop());
        selected_student.setDOB(new_student.getDOB());
    }
    public void deleteById(long id){
        studentList.remove(studentList.stream().filter(x->x.id==id).toList().get(0));
    }
    public List<Student> getAllByName(String name){
        return studentList.stream().filter(x->x.name.contains(name)).toList();
    }
}
