package SimpleFactory;

public class CarbonaraPizza implements Pizza{

    public CarbonaraPizza() {

    }

    @Override
    public void descriere() {
        System.out.println("Pizza carbonara");
    }
}
