package pl.com.bottega.documentmanagement.CoffeProject.app;

import pl.com.bottega.documentmanagement.CoffeProject.Coffe;
import pl.com.bottega.documentmanagement.CoffeProject.ingredients.Czekolada;
import pl.com.bottega.documentmanagement.CoffeProject.ingredients.Rumianek;
import pl.com.bottega.documentmanagement.CoffeProject.ingredients.SyropKlonowy;
import pl.com.bottega.documentmanagement.CoffeProject.sizes.Big;
import pl.com.bottega.documentmanagement.CoffeProject.sizes.Medium;
import pl.com.bottega.documentmanagement.CoffeProject.sizes.Small;

/**
 * Created by ulvar on 21.08.2016.
 */
public class SellApplication {

    public static void main(String[] args) {
        Coffe mediumCoffe = new Medium();
        Coffe smallCoffe = new Small();
        Coffe bigCoffe = new Big();


        System.out.println("\nCzysta");
        System.out.println(bigCoffe.name() + " " + bigCoffe.price());
        System.out.println(mediumCoffe.name() + " " + mediumCoffe.price());
        System.out.println(smallCoffe.name() + " " + smallCoffe.price());


        smallCoffe = new Czekolada(new SyropKlonowy(new Rumianek(smallCoffe)));
        mediumCoffe = new SyropKlonowy(mediumCoffe);
        System.out.println("\nz dodatkami");
        System.out.println(smallCoffe.name() + " " + smallCoffe.price());
        System.out.println(mediumCoffe.name() + " " + mediumCoffe.price());
    }
}
