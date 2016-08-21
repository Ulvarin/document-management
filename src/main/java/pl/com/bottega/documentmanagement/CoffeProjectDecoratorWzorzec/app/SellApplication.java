package pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.app;

import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.Coffe;
import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.ingredients.Czekolada;
import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.ingredients.Rumianek;
import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.ingredients.SyropKlonowy;
import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.sizes.Big;
import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.sizes.Medium;
import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.sizes.Small;

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
