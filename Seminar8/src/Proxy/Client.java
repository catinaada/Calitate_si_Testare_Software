package Proxy;

public class Client {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("www.hm.com");
            internet.connectTo("www.site1.com");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

 /*  se creează un obiect de tip ProxyInternet și se apelează metoda connectTo()
 pentru două servere diferite. Dacă server-ul este unul dintre site-urile interzise,
 atunci se va arunca o excepție și utilizatorul nu va fi conectat la server-ul respectiv.  */