package Builder;

public class FacilitatiStandardBuilder implements FacilitatiPacientBuilder {
    private FacilitatiPacient facilitatiPacient;

    public FacilitatiStandardBuilder() {
        this.facilitatiPacient = new FacilitatiStandard();
    }

    @Override
    public void buildPat() {
        this.facilitatiPacient.setPat(" Pat normal ");
    }

    @Override
    public void buildHalat() {
        this.facilitatiPacient.setHalat(" fara halat ");
    }

    @Override
    public void buildMicDejun() {
        this.facilitatiPacient.setMicDejun(" fara mic dejun inclus ");
    }

    @Override
    public void buildPapuci() {
        this.facilitatiPacient.setPapuci(" fara papuci de camera ");
    }

    @Override
    public FacilitatiPacient getFacilitatiPacient() {
        return this.facilitatiPacient;
    }
}
