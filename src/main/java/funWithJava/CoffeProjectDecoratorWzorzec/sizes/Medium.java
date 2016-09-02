package funWithJava.CoffeProjectDecoratorWzorzec.sizes;

import funWithJava.CoffeProjectDecoratorWzorzec.Coffe;

/**
 * Created by ulvar on 21.08.2016.
 */
public class Medium extends Coffe {
    @Override
    public double price() {
        return 8;
    }

    @Override
    public String name() {
        return " medium coffe";

    }
}

