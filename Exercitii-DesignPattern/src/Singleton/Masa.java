package Singleton;

public class Masa {
    int numarMasa;
    boolean masaLibera;
    boolean masaDebarasata;
    boolean masaCuServetele;

    public Masa(int numarMasa, boolean masaLibera, boolean masaDebarasata, boolean masaCuServetele) {
        this.numarMasa = numarMasa;
        this.masaLibera = masaLibera;
        this.masaDebarasata = masaDebarasata;
        this.masaCuServetele = masaCuServetele;
    }

    public int getNumarMasa() {
        return numarMasa;
    }
    public void setNumarMasa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public boolean isMasaLibera() {
        return masaLibera;
    }

    public void setMasaLibera(boolean masaLibera) {
        this.masaLibera = masaLibera;
    }

    public boolean isMasaDebarasata() {
        return masaDebarasata;
    }

    public void setMasaDebarasata(boolean masaDebarasata) {
        this.masaDebarasata = masaDebarasata;
    }

    public boolean isMasaCuServetele() {
        return masaCuServetele;
    }

    public void setMasaCuServetele(boolean masaCuServetele) {
        this.masaCuServetele = masaCuServetele;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "numarMasa=" + numarMasa +
                ", masaLibera=" + masaLibera +
                ", masaDebarasata=" + masaDebarasata +
                ", masaCuServetele=" + masaCuServetele +
                '}';
    }

}
