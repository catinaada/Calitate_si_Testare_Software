package Flyweight.exp1;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        // The first time a flyweight is requested, a new instance is created
        Flyweight flyweight1 = factory.getFlyweight("key1");
        flyweight1.operation();

        // Subsequent requests for the same flyweight return the same instance
        Flyweight flyweight2 = factory.getFlyweight("key1");
        flyweight2.operation();
    }
}