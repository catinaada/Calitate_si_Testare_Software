package State.exp1;

public class Rezervat implements State{
    @Override
    public void doAction() {

        System.out.println("State changed to: Reserved");
    }
}
