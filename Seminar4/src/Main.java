public class Main {
    public static void main(String[] args) {
        // Singleton - instanta unica ; constructor privat
        //se da mereu !!!!!!!!

        //1. testare instantiere obiect nou
        Server exempluServer=Server.getInstata(80,"Dorel");
        Server exempluServerNou=Server.getInstata(2,"Mimi");

//        System.out.println(exempluServer.getPort()+" "+exempluServer.getNume());
//        System.out.println(exempluServerNou.getPort()+" "+exempluServerNou.getNume());

        exempluServer.showStatus();
        exempluServerNou.showStatus();

        //o fabrica de masina care implementeaza in sistem centralizat de monitorizat de productie.
        //sistemul trebuie sa asigure stocarea datelor, adaugarea si modificarea datelor despre masinile fabricate la nivelul sediului central
        //intr-un mediu securizat,  sistemul va exista sub forma unui server dispus in datacenter-ul din hq.
        //programatorii trebuie sa asigure ca sistemul nu va putea fi replicat si ca toate datele vor putea fi manipulate prin intermediul
        //singurului server mentionat anterior.

        Masina masina1=Masina.getInstanta(123,"BMW");
        Masina masina2=Masina.getInstanta(3,"LR");

    }
}