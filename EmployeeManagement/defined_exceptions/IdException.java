package EmployeeManagement.defined_exceptions;

public class IdException extends Exception {
    long id;

    public IdException(long id) {
        this.id = id;
    }

    public void printMessage() {
        System.out.println("Employee with ID " + id + " is existing");
    }

    public long getId() {
        return id;
    }
}
