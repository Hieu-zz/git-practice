package org.example.zoo.animals;
abstract class Animal {
        String name;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public void setName(String name) {
        this.name = name;
    }

        abstract public void makeSound();

        public void getName(){
        System.out.println(name);
        }

}
