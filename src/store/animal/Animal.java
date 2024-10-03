package store.animal;

public abstract class Animal {
    String name;

    public void getName() {
        System.out.println("Animal's name is: " + name);
    }

    public abstract void makeSound();
}
