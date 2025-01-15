package SimpleFactory;

public class CheesePizza implements Pizza{
    public CheesePizza(){

    }

    @Override
    public void descriere(){
        System.out.println("Pizza cu branza");
    }
}
