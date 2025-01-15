package FactoryMethod;

public class BrancardierFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital crearePersonal() {
        return new Brancardier();
    }
}
