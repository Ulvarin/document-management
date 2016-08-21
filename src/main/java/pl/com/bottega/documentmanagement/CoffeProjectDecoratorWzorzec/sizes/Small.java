package pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.sizes;

import pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec.Coffe;

/**
 * Created by ulvar on 21.08.2016.
 */
public class Small extends Coffe {
    @Override
    public double price() {
        return 5;
    }

    @Override
    public String name() {
        return " small coffe";

    }
}
