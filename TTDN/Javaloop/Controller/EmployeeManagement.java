package Controller;

import Model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {

    public List<Employee> listEm;


    public EmployeeManagement() {
        listEm = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);
    public void them(){
        System.out.println("Thêm thông tin nhân viên: ");
        System.out.println("ID: ");
        long id = sc.nextLong();
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Age: ");
        int age = sc.nextInt();
        System.out.println("DOB: ");
        String DOB = sc.next();
        System.out.println("Phone: ");
        String phone = sc.next();
        System.out.println("WorkAs: ");
        String workAs = sc.next();
        Employee e = new Employee(id,name,age,DOB,phone,workAs);
        listEm.add(e);
        System.out.println("Thêm thành công!!!");
    }
    public void sua(long id){
        boolean check = false;
        for (int i=0;i<listEm.size();i++){
            if(listEm.get(i).getId() == id){
                check = true;
                listEm.get(i).setName(sc.next());
                listEm.get(i).setAge(sc.nextInt());
                listEm.get(i).setDOB(sc.next());
                listEm.get(i).setPhoneNumber(sc.next());
                listEm.get(i).setWorkAs(sc.next());
            }
        }
        if (!check){
            System.out.println("Ko tồn tại nhân viên này!");
        }
    }
    public  void xoa(long id){
        for (Employee e : listEm){
            if(e.getId() == id){
                listEm.remove(e);
            }
        }

    }

    public void hienThiDS(){
       int i =1;
       for (Employee e: listEm){
           System.out.println("Thông tin nhân viên "+ (i));
           System.out.print("ID:"+e.getId());
           System.out.print(";  Name:"+e.getName());
           System.out.print("; Age:"+e.getAge());
           System.out.print("; DOB:"+e.getDOB());
           System.out.print("; Phone:"+e.getPhoneNumber());
           System.out.print("; WorkAs: "+e.getWorkAs());
           i++;
       }
    }

    //Danh sách nhân viên chưa có phòng
    public List<Employee> employeeNoHasRoom(){
        List<Employee> listNoRoom = new ArrayList<>();
        for (Employee e : listEm){
           if(!e.isHasRoom()){
               listNoRoom.add(e);
           }
        }
        return listNoRoom;
    }

    public Employee timEmId(long id){
        for (Employee e: listEm){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
    public void xoaNhanVien(long id){
        //Tìm nhân viên theo Id
        Employee removeEmployee = timEmId(id);
        if(removeEmployee != null){
            //Kiểm tra có phòng ko
            if(removeEmployee.isHasRoom()){
                listEm.remove(removeEmployee);
            }
        }
    }
}
