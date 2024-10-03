package interface_demo;

public class Cat implements IAnimalAction {

    @Override
    public void run() {
        System.out.println("The cat is running");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping");
    }

    public static void main(String[] args) {
        Cat orangeCat = new Cat();
        orangeCat.run();
        orangeCat.eat();
        orangeCat.sleep();
    }
}
