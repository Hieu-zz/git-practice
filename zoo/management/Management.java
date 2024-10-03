package zoo.management;

import zoo.animals.*;

public class Management {
    public static void main(String[] args) {
        Animals bird = new Bird("Bird name");
        Animals lion = new Lion("Lion name");
        System.out.println(bird.getName());
        bird.makeSound();
        ((Bird) bird).fly();

        System.out.println(lion.getName());
        lion.makeSound();
        ((Lion) lion).hunt();
    }
}
