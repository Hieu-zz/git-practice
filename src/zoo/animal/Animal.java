package zoo.animal;

abstract class Animal   {
    private String name ;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    abstract void makeSound();
    public void getName(){
        System.out.println(name);
    };

    public void setName(String name) {
        this.name = name;
    }
}
