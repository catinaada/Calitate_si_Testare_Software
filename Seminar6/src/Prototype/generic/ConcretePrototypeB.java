package Prototype.generic;

public class ConcretePrototypeB implements Prototype {
    public Prototype clone() {
        return new ConcretePrototypeB();
    }
}
