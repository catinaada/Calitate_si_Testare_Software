public class Masina {

    private static Masina instanta;
    int serie;
    String nume;
    private Masina(int serie, String nume){
        this.nume=nume;
        this.serie=serie;
    }

    public static Masina getInstanta(int serie, String nume){
        if(instanta==null){
            instanta=new Masina( serie,  nume );
        }
        return instanta;
    }

    public void showStatus(){
        System.out.println("masina ");
    }
}
