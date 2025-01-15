package FactoryMethod;

public class MedicFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital crearePersonal() {
        return new Medic();
    }
}
