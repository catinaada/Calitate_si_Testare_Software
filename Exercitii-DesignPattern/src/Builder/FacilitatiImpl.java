package Builder;

public class FacilitatiImpl {
    private FacilitatiPacientBuilder builder;

    public FacilitatiImpl(FacilitatiPacientBuilder builder) {
        this.builder = builder;
    }

    public void buildFacilitati(){
        builder.buildHalat();
        builder.buildMicDejun();
        builder.buildPapuci();
        builder.buildPat();
    }
    public FacilitatiPacient getFacilitatiPacient(){
        return builder.getFacilitatiPacient();
    }
}
