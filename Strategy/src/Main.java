public class Main {
    public static void main(String[] args) {
        Client client=new Client("Popescu"); //default e pt cash

        client.setModPlata(new Card());
        client.plateste(300);

        client.setModPlata(new Cash());
        client.plateste(100);

        client.setModPlata(new PayPal());
        client.plateste(200);
    }