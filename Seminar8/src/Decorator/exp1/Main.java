package Decorator.exp1;

/*
* În acest exemplu, interfața Subscription definește metodele  getDescription și
* getPrice pentru a obține descrierea și prețul unui abonament. Clasa BasicSubscription
* implementează interfața Subscription și reprezintă implementarea de bază a unui
* abonament.Clasa abstractă SubscriptionDecorator este un decorator abstract care
* implementează interfața Subscription și conține o referință către un obiect de tip
* Subscription. Aceasta permite extinderea funcționalității obiectului Subscription
* inițial prin adăugarea de opțiuni suplimentare.
*/
public class Main {
    public static void main(String[] args) {

        //creeaza un abonament de baza
        Subsciption subscription=new BasicSubscription();

        //adauga optiune de vizualizare offline
        subscription=new OfflineViewDecorator(subscription);

        //adauga optiune de vizionare in calitate hd
        subscription=new HDStreamingDecorator(subscription);

        //afiseaza descrierea si pretul final al abonamentului
        System.out.println("Descriere: "+subscription.getDescription());
        System.out.println("Pret "+subscription.getPrice());

    }
}