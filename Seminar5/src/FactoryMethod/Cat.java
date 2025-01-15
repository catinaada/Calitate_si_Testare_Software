package FactoryMethod;

public class Cat implements Animal{
    public Cat() {
        System.out.println("Sunt o pisica");
    }
    @Override
    public void makeSound() {
        System.out.println("MEOW");

    }
}
