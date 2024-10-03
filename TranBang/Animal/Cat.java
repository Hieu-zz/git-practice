package org.example.store.Animal;

public class Cat implements IAnimalAction{
    @Override
    public void run() {
        System.out.println("toi dang chay");
    }

    @Override
    public void sleep() {
        System.out.println("toi dang ngu");
    }

    @Override
    public void eat() {
        System.out.println("toi dang an");
    }
}
