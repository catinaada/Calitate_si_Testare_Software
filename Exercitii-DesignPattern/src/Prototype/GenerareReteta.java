package Prototype;

import java.util.HashMap;
import java.util.Map;

public class GenerareReteta {
    private Map<String,Reteta> retete=new HashMap<>();

    public GenerareReteta() {
        retete.put("paracetamol",new RetetaParacetamol());
        retete.put("nospa",new RetetaNoSpa());
    }
    public Reteta descriere(String type) {
        try{
            Reteta reteta=retete.get(type).clone();
            reteta.descriere();
            return reteta;
        }catch (CloneNotSupportedException e){
            System.out.println("Error cloning prototype");
            return null;

        }


    }
}
