import java.util.List;

public class StudentService {
    public bai5 bai5=new bai5();
    public String toString(Student student){
        return "Id: "+student.getId()+" Ten: "+student.getName()+" Tuoi: "+student.getAge()+" Lop: "+student.getLop()+" Ngay sinh: "+student.getDOB();
    }
    public void insert(Student student){
        bai5.studentList.add(student);
    }
    public List<Student> getAll(){
        return bai5.studentList;
    }
    public Student getById(long id){
        Student student=bai5.studentList.stream().filter(x->x.getId()==id).toList().get(0);
        return student;
    }
    public void update(long id,Student new_student){
        Student selected_student= bai5.studentList.stream().filter(x->x.getId()==id).toList().get(0);
        selected_student.setName(new_student.getName());
        selected_student.setAge(new_student.getAge());
        selected_student.setLop(new_student.getLop());
        selected_student.setDOB(new_student.getDOB());
    }
    public void deleteById(long id){
        bai5.studentList.remove(bai5.studentList.stream().filter(x->x.getId()==id).toList().get(0));
    }
    public List<Student> getAllByName(String name){
        return bai5.studentList.stream().filter(x->x.getName().contains(name)).toList();
    }
}
