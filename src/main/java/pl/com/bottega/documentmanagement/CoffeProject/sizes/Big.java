package pl.com.bottega.documentmanagement.CoffeProject.sizes;

import pl.com.bottega.documentmanagement.CoffeProject.Coffe;

/**
 * Created by ulvar on 21.08.2016.
 */
public class Big extends Coffe {
    @Override
    public double price() {
        return 10;
    }

    @Override
    public String name() {
        return " big coffe";

    }
}

