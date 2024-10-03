package zoo.animals;

public class Lion extends Animal{

    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    @Override
     public void makeSound() {
        System.out.println("gu gu");
    }

    public void hunt(){
        System.out.println("i cant hunt");
    }
}
