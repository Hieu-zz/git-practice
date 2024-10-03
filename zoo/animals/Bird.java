package zoo.animals;

public class Bird extends Animals {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }

    public void fly() {
        System.out.println("Flying in the sky");
    }

}
