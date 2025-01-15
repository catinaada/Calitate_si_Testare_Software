package FactoryMethod;

public class AsistentFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital crearePersonal() {
        return new Asistent();
    }
}
