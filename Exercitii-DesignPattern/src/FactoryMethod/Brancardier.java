package FactoryMethod;

public class Brancardier implements PersonalSpital {

    public Brancardier() {
        System.out.println("Sunt brancardier");

    }
    @Override
    public void atributie() {
        System.out.println("Ajut pacientii");
    }
}
