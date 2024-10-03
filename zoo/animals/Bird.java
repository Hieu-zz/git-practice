package zoo.animals;

public class Bird extends Animal{
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
   public void makeSound() {
        System.out.println("liu lo");
    }

    public void fly(){
        System.out.println("i can fly");
    }


}
