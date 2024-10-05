package Controller;

public class check extends Exception{
    long id;
    public  check(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    String name;

    public check(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
