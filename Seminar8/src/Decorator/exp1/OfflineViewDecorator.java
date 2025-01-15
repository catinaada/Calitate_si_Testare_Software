package Decorator.exp1;

public class OfflineViewDecorator extends SubscriptionDecorator{

    //decorator pt adaugarea de opt de vizionare offline

    public OfflineViewDecorator(Subsciption subsciption) {
        super(subsciption);
    }
    @Override
    public String getDescription() {
        return subsciption.getDescription()+" vizionare offline";
    }

    @Override
    public double getPrice() {
        return subsciption.getPrice()+5.0;
    }
}
