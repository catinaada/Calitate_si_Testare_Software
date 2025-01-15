package Decorator.exp1;

public class SubscriptionDecorator implements Subsciption{
    protected Subsciption subsciption;

    public SubscriptionDecorator(Subsciption subsciption){
        this.subsciption=subsciption;
    }
    @Override
    public String getDescription() {
        return subsciption.getDescription();
    }

    @Override
    public double getPrice() {
        return subsciption.getPrice();
    }
}
