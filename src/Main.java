import store.animal.Animal;
import store.animal.Bird;
import store.animal.Lion;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird("chim1");
        bird.getName();
        bird.makeSound();

        Animal lion = new Lion("sutu2");
        lion.getName();
        lion.makeSound();

    }
}
