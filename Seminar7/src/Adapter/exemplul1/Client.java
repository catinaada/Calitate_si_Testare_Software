package Adapter.exemplul1;

import Adapter.exemplul1.Adaptee;
import Adapter.exemplul1.Adapter;

public class Client {

    //adapter de obiecte
    public static  void main(String[] args){
        Adaptee adaptee=new Adaptee();
        Target target=new Adapter(adaptee);
        target.request();
    }
}
