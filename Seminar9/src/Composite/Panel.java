package Composite;

import java.util.ArrayList;
import java.util.List;

//aici este exemplul de la seminar
public class Panel implements Component{

    private List<Component> componente=new ArrayList<>();

    public void adaugaComponenta(Component component){
        componente.add(component);
    }
    public void eliminaComponenta(Component component){
        componente.remove(component);
    }
    @Override
    public void render() {
        System.out.println("Se afiseaza panoul");

        for(Component component: componente){
            component.render();
        }
    }
}
