package FactoryMethod;

public class Rabbit implements Animal{

    public Rabbit(){
        System.out.println("Sunt un iepure");
    }
    @Override
    public void makeSound() {
        System.out.println("rychit");
    }
}
