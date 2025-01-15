package Singleton;
import java.util.ArrayList;
import java.util.List;

//masa libera, masa debarasata, servetele pe masa
public class GestiuneMasa {
    private static GestiuneMasa instanta;
    String nume;
    public List<Masa> masaList;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    private GestiuneMasa(String nume){
        this.nume=nume;
        this.masaList=new ArrayList<>();
    }

    public void adaugaMasa(Masa masaNoua){
        boolean existaMasa=false;
        for(Masa masa:masaList){
            if(masaNoua.getNumarMasa()==masa.getNumarMasa()){
                existaMasa=true;
            }
        }
        if(existaMasa==false){
            masaList.add(masaNoua);
        }
    }

    public String getMasa(int nrMasa){
        for(Masa masa:masaList){
            if(nrMasa==masa.getNumarMasa()){
                return masa.toString();
            }
        }
        return null;
    }

    public static GestiuneMasa getInstanta(String nume){
        if(instanta==null){
            instanta=new GestiuneMasa(nume);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "GestiuneMasa{" +
                "nume='" + nume + '\'' +
                ", masaList=" + masaList +
                '}';
    }
}
