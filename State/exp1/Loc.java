package State.exp1;

public class Loc {
    private int no;
    private State currentState;

    public Loc(int no)
    {
        this.no = no;
        this.currentState = new Neocupat();
    }

    public void reserveSeat()
    {
        if(this.currentState instanceof Neocupat)
        {
            this.currentState = new Rezervat();
            this.currentState.doAction();
        }
        else
        {
            System.out.println("Current seat is not available for reservation.");
        }
    }

    public void occupySeat()
    {
        if(!(this.currentState instanceof Ocupat))
        {
            this.currentState = new Ocupat();
            this.currentState.doAction();
        }
        else
        {
            System.out.println("Current seat is already occupied.");
        }
    }

    public void freeSeat()
    {
        if(!(this.currentState instanceof Neocupat))
        {
            this.currentState = new Neocupat();
            this.currentState.doAction();
        }
        else
        {
            System.out.println("Current seat is already available.");
        }
    }
}
