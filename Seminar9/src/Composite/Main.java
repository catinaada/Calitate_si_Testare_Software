package Composite;

public class Main {
    public static void main(String[] args) {

       Component buton1=new Button();
       Component buton2=new Button();
       Component campText=new TextField();

       //exemplul de la seminar
       Component panou1=new Panel();
       ((Panel) panou1).adaugaComponenta(buton1);
       panou1.render();
        System.out.println("\n");

       //exemplul nou
       Component2 panou=new Panel2();
        panou.adaugaComponenta(buton1);
        panou.adaugaComponenta(campText);
        panou.render();

       System.out.println("\n");
       panou.eliminaComponenta(campText);
       panou.render();


    }
}