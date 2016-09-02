package funWithJava.CoffeProjectDecoratorWzorzec.app;

import funWithJava.CoffeProjectDecoratorWzorzec.Coffe;
import funWithJava.CoffeProjectDecoratorWzorzec.ingredients.Czekolada;
import funWithJava.CoffeProjectDecoratorWzorzec.ingredients.Rumianek;
import funWithJava.CoffeProjectDecoratorWzorzec.ingredients.SyropKlonowy;
import funWithJava.CoffeProjectDecoratorWzorzec.sizes.Big;
import funWithJava.CoffeProjectDecoratorWzorzec.sizes.Medium;
import funWithJava.CoffeProjectDecoratorWzorzec.sizes.Small;

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
