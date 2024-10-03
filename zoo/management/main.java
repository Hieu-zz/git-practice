package zoo.management;

import zoo.animals.Bird;
import zoo.animals.Lion;

public class main {
    public static void main(String[] args) {
        Lion lion = new Lion("lion");
        Bird bird = new Bird("bird");
        lion.hunt();
        bird.fly();
        lion.makeSound();
        bird.makeSound();

    }
}
