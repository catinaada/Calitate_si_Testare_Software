package Flyweight.exp2;

public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }
    @Override
    public void operation() {
        System.out.println("ConcreteFlyweight: " + intrinsicState);
    }
}
