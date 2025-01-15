package Builder;

public class FacilitatiExtraBuilder implements FacilitatiPacientBuilder {

    private FacilitatiPacient facilitatiPacient;

    public FacilitatiExtraBuilder() {
        this.facilitatiPacient = new FacilitatiExtra();
    }

    @Override
    public void buildPat() {
        this.facilitatiPacient.setPat(" Pat rabatabil ");
    }

    @Override
    public void buildHalat() {
        this.facilitatiPacient.setHalat(" halat pentru interior ");
    }

    @Override
    public void buildMicDejun() {
        this.facilitatiPacient.setMicDejun(" mic dejun inclus ");
    }

    @Override
    public void buildPapuci() {
        this.facilitatiPacient.setPapuci(" papuci de camera ");
    }

    @Override
    public FacilitatiPacient getFacilitatiPacient() {
        return this.facilitatiPacient;
    }
}
