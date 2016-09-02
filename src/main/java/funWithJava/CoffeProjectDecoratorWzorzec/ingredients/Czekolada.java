package funWithJava.CoffeProjectDecoratorWzorzec.ingredients;

import funWithJava.CoffeProjectDecoratorWzorzec.Coffe;
import funWithJava.CoffeProjectDecoratorWzorzec.CoffeDecorator;

/**
 * Created by ulvar on 21.08.2016.
 */
public class Czekolada extends CoffeDecorator {
    Coffe coffe;

    public Czekolada(Coffe coffe) {
        this.coffe = coffe;
    }

    public String name() {
        return coffe.name() + " + Czekolada";
    }

    public double price() {


        return coffe.price() + 15;
    }
}

