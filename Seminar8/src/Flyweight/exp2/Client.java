package Flyweight.exp2;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("state1");
        Flyweight flyweight2 = factory.getFlyweight("state2");
        Flyweight flyweight3 = factory.getFlyweight("state1");

        flyweight1.operation();
        flyweight2.operation();
        flyweight3.operation();
    }
}