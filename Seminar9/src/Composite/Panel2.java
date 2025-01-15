package Composite;

import java.util.ArrayList;
import java.util.List;

//noul panel
public class Panel2 implements Component2 {
    private List<Component> componente=new ArrayList<>();

    @Override
    public void render() {
        System.out.println("Se afiseaza panoul");

        for(Component component: componente){
            component.render();
        }
    }

    @Override
    public void eliminaComponenta(Component component) {
        componente.remove(component);
    }

    @Override
    public void adaugaComponenta(Component component) {
        componente.add(component);

    }
}
