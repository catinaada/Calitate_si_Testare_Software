package Decorator.exp1;

public class HDStreamingDecorator  extends SubscriptionDecorator{

    //decorator pt adaugarea de opt de vizionare in calitate hd
    public HDStreamingDecorator(Subsciption subsciption) {
        super(subsciption);
    }
    @Override
    public String getDescription() {
        return subsciption.getDescription()+" vizionare calitate HD";
    }

    @Override
    public double getPrice() {
        return subsciption.getPrice()+3.0;
    }
}
