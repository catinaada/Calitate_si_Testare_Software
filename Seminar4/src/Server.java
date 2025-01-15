
public class Server {
    int port;
    String nume;
    private static Server instata; //trebuie sa fie privata:

    //metoda preluam instanta

    private Server(int port,String nume){
        this.port=port;
        this.nume=nume;
    }

    //verificare existenta instanta
    // daca este prima accesare -> Server.instanta=new Server()
    //daca nu este prima accesare -> returnare Server de instanta
    public static Server getInstata(int port,String nume){
     if(instata==null){
         instata=new Server( port, nume);
     }
        return instata;
    }
    public void showStatus(){
        System.out.println("Serverul "+getNume()+" are portul "+getPort());
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
