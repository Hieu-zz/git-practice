package IAnimalAction;

public class Cat implements IAnimalAction , IAnimalRun {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void around() {

    }
}
