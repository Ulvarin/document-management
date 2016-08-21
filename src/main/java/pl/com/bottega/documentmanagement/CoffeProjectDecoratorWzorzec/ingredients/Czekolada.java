package pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.ingredients;

import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.Coffe;
import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.CoffeDecorator;

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

