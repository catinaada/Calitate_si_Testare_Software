package FactoryMethod;

public class Asistent implements PersonalSpital{

    public Asistent() {
        System.out.println("Sunt asistent");

    }

    @Override
    public void atributie() {
        System.out.println("Administrez tratamente prescrise de medic");
    }
}
