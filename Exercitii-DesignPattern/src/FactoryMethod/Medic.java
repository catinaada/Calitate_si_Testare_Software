package FactoryMethod;

public class Medic implements PersonalSpital{

    public Medic() {
        System.out.println("Sunt medic");
    }

    @Override
    public void atributie() {
        System.out.println("Ofer diagnostic pacientilor");
    }
}
