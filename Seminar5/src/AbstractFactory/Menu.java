package AbstractFactory;

public class Menu implements View{
    String type;
    public Menu(String type){
        this.type=type;
    }
    @Override
    public void show() {
        System.out.println("Menu "+type);
    }
}
