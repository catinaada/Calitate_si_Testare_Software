package Prototype;

import java.util.ArrayList;
import java.util.List;

public class RetetaParacetamol implements Reteta {

    @Override
    public void descriere() {
        System.out.println("Ingrediente Paracetamol");

    }

    @Override
    public Reteta clone() throws CloneNotSupportedException{
        return (RetetaParacetamol)super.clone();
    }
}
