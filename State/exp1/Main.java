package State.exp1;

public class Main {

    public static void main(String[] args) {
        Loc s1 = new Loc(1);
        s1.reserveSeat();
        s1.occupySeat();
        s1.freeSeat();
        s1.freeSeat();
    }
}
