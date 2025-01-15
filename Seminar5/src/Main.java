import SimpleFactory.*;
import FactoryMethod.*;
import AbstractFactory.*;
public class Main {
    public static void main(String[] args) throws Exception {

        //simple factory
        CheesePizza cheesePizza=null;
        cheesePizza=(CheesePizza) PizzaFactory.createPizza(PizzaType.Cheese);
        cheesePizza.descriere();

        CarbonaraPizza carbonaraPizza=null;
        carbonaraPizza=(CarbonaraPizza) PizzaFactory.createPizza(PizzaType.Carbonara);
        carbonaraPizza.descriere();

        PepperoniPizza pepperoniPizza=null;
        pepperoniPizza=(PepperoniPizza) PizzaFactory.createPizza(PizzaType.Pepperoni);
        pepperoniPizza.descriere();

        //factory method
        DogFactory dogFactory = new DogFactory();
        Dog dog= (Dog) dogFactory.createAnimal();
        dog.makeSound();

        CatFactory catFactory = new CatFactory();
        Cat cat= (Cat) catFactory.createAnimal();
        cat.makeSound();

        RabbitFactory rabbitFactory = new RabbitFactory();
        Rabbit rabbit= (Rabbit) rabbitFactory.createAnimal();
        rabbit.makeSound();

        //abstract factory
        WindowsGUIFactory windowsGUIFactory = new WindowsGUIFactory();
        Button buttonWin = windowsGUIFactory.createButton();
        Menu menuWin = windowsGUIFactory.createMenu();
        buttonWin.show();
        menuWin.show();

        MacGUIFactory macGUIFactory=new MacGUIFactory();
        Button buttonMac = macGUIFactory.createButton();
        Menu menuMac = macGUIFactory.createMenu();
        buttonMac.show();
        menuMac.show();



    }
}