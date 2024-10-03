package zoo.management;
import zoo.animals.Animal;
import zoo.animals.Bird;
import zoo.animals.Lion;

public class Main {
    public static void main(String[] args) {
        Lion l = new Lion("lion");
        Bird b = new Bird("bird");
        l.makeSound();
        b.makeSound();
        l.hunt();
        b.fly();
    }
}
