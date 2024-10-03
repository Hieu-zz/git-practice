package zoo.animal;

public class Main {
    public static void main(String[] args){
        Animal animal = new Lion();
        Lion lion = new Lion();
        Bird bird = new Bird();
        lion.makeSound();
        lion.hunt();
        bird.makeSound();
        bird.fly();
        animal.makeSound();
    }
}
