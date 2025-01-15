package Decorator.exp1;

public class BasicSubscription implements Subsciption{

    //implementare de baza a unui abonament
    @Override
    public String getDescription() {
        return "Abonament de baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }

}
