package State.exp1;

public class Ocupat implements State{
    @Override
    public void doAction() {

        System.out.println("State changed to: Occupied");
    }
}
