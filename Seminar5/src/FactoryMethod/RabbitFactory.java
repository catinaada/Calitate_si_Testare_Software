package FactoryMethod;

public class RabbitFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Rabbit();
    }
}
