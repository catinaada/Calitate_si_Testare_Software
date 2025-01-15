package AbstractFactory;

public class Button implements View {
    String type;
    public Button(String type){
        this.type=type;
    }
    @Override
    public void show() {
        System.out.println("Button "+type);
    }
}
