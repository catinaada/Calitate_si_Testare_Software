package FactoryMethod;

/*
 În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic.
Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor
PersonalSpital. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de personal să
nu fie necesare modificări în codul existent.
*/
public class Program {
    public static void main(String[] args) {

        AsistentFactory asistentFactory= new AsistentFactory();
        Asistent asistent=(Asistent) asistentFactory.crearePersonal();
        asistent.atributie();

        MedicFactory medicFactory= new MedicFactory();
        Medic medic=(Medic) medicFactory.crearePersonal();
        medic.atributie();

        BrancardierFactory brancardierFactory= new BrancardierFactory();
        Brancardier brancardier=(Brancardier) brancardierFactory.crearePersonal();
        brancardier.atributie();
    }

}
