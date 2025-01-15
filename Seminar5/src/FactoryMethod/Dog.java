package FactoryMethod;

public class Dog implements Animal {
    public Dog() {
        System.out.println("Sunt un caine");
    }
    @Override
    public void makeSound() {
        System.out.println("HAM");

    }
}
