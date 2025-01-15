package Builder;

/*
. Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare pacient
are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic dejun inclus,
papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste facilitați extra,
in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea de obiecte de
tipul pacient cu opțiuni extra.

*/

public class Program {
    public static void main(String[] args){

        FacilitatiPacientBuilder builder=new FacilitatiStandardBuilder();
        FacilitatiImpl implementare=new FacilitatiImpl(builder);
        implementare.buildFacilitati();
        FacilitatiPacient facilitatiPacient=implementare.getFacilitatiPacient();
        System.out.println(facilitatiPacient.afisareFacilitati());

        builder=new FacilitatiExtraBuilder();
        implementare=new FacilitatiImpl(builder);
        implementare.buildFacilitati();
        facilitatiPacient=implementare.getFacilitatiPacient();
        System.out.println(facilitatiPacient.afisareFacilitati());

    }
}
