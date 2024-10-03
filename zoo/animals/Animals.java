package zoo.animals;

public abstract class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void makeSound();

}
