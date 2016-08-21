package pl.com.bottega.documentmanagement.CoffeProject.ingredients;

import pl.com.bottega.documentmanagement.CoffeProject.Coffe;
import pl.com.bottega.documentmanagement.CoffeProject.CoffeDecorator;

/**
 * Created by ulvar on 21.08.2016.
 */
public class Rumianek extends CoffeDecorator {
    Coffe coffe;

    public Rumianek(Coffe coffe) {
        this.coffe = coffe;
    }

    public String name() {
        return coffe.name() + " + Rumianek";
    }

    public double price() {

        return coffe.price() + 10;
    }
}

