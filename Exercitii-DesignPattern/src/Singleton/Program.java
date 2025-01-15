package Singleton;

/*
 În momentul în care un client vine la restaurant pentru o masă, recepționistul trebuie să verifice
dacă are masă liberă, apoi să verifice dacă acea masă a fost debarasată de la plecarea ultimului
client, de asemenea trebuie să verifice dacă au fost puse șervețele noi pe masă. Managerul
restaurantului dorește realizarea unui modul care să simplifice munca recepționistului și să nu mai
fie nevoit să verifice în toate locurile ci doar într-un singur loc.
 */
public class Program {
        public static void main(String[] args) {

            //Singleton

            GestiuneMasa gestiuneMasa1=GestiuneMasa.getInstanta("Gestiune 1");
            gestiuneMasa1.adaugaMasa(new Masa(1,true,false,false));
            gestiuneMasa1.adaugaMasa(new Masa(2,false,true,false));
            gestiuneMasa1.adaugaMasa(new Masa(1,true,true,false));

            System.out.println(gestiuneMasa1.getNume());
            System.out.println(gestiuneMasa1.getMasa(1));
            System.out.println(gestiuneMasa1.getMasa(2));

            GestiuneMasa gestiuneMasa2=GestiuneMasa.getInstanta("Gestiune 2");
            gestiuneMasa2.adaugaMasa(new Masa(4,false,false,false));
            gestiuneMasa2.adaugaMasa(new Masa(3,true,true,true));

            System.out.println(gestiuneMasa2.getNume());
            System.out.println(gestiuneMasa2.getMasa(3));
            System.out.println(gestiuneMasa2.getMasa(4));

    }
}
