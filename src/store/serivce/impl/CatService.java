package store.serivce.impl;

import store.serivce.IAnimalAction;

public class CatService implements IAnimalAction {
    @Override
    public void run() {
        System.out.println("Con meo dang chay");
    }

    @Override
    public void sleep() {
        System.out.println("Con meo dang ngu");
    }

    @Override
    public void eat() {
        System.out.println("Con meo dang an");
    }
}
