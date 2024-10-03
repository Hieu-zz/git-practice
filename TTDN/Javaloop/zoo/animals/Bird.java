package zoo.animals;

public class Bird extends Animal{
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("líu lo lo lo");
    }
    public void fly(){
        System.out.println("flyyyy");
    }
}
