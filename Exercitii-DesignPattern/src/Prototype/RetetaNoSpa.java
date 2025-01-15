package Prototype;
public class RetetaNoSpa implements Reteta {

    @Override
    public void descriere() {
        System.out.println("Ingrediente NosSpa");

    }

    @Override
    public Reteta clone() throws CloneNotSupportedException {
        return (RetetaNoSpa) super.clone();
    }
}
