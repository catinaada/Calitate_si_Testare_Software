package AbstractFactory;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new Button("Mac");
    }

    @Override
    public Menu createMenu() {
        return new Menu("Mac");
    }
}
