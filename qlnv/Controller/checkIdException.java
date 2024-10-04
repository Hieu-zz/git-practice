package qlnv.Controller;

public class checkIdException extends Exception {
    private long id;
    public checkIdException(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }

}
