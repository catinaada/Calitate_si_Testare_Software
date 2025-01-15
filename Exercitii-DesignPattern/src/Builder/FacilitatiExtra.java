package Builder;

public class FacilitatiExtra implements FacilitatiPacient{

    String pat;
    String papuci;
    String halat;
    String micDejun;

    @Override
    public void setPat(String pat) {
        this.pat=pat;
    }

    @Override
    public void setMicDejun(String micDejun) {
        this.micDejun=micDejun;
    }

    @Override
    public void setPapuci(String papuci) {
        this.papuci=papuci;

    }

    @Override
    public void setHalat(String halat) {
        this.halat=halat;
    }

    @Override
    public String afisareFacilitati() {
        return "FacilitatiExtra{" +
                "pat='" + pat + '\'' +
                ", papuci='" + papuci + '\'' +
                ", halat='" + halat + '\'' +
                ", micDejun='" + micDejun + '\'' +
                '}';

    }

}
