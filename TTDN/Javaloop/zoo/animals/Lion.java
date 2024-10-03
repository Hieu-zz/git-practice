package zoo.animals;

import java.util.SortedMap;

public class Lion extends Animal{
    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Gao gao");
    }

    public void hunt(){
        System.out.println("hunt");
    }
}
