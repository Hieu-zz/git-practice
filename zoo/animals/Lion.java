package zoo.animals;

public class Lion extends Animals {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    public void hunt() {
        System.out.println("Goes hunting");
    }
}
