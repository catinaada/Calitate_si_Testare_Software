public class PayPal implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient+" plateste prin Pay Pal suma de "+sumaPlatita+" RON ");

    }
}
