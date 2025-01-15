public class Card implements ModPlata {
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient+" plateste cu cadul suma de "+sumaPlatita+" RON ");
    }
}
