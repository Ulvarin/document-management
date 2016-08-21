package pl.com.bottega.documentmanagement.CoffeProjectDecoratorWzorzec;

/**
 * Created by ulvar on 21.08.2016.
 */
public abstract class Coffe {

    protected String coffe = "Kawa";

    public abstract double price();


    public String name() {
        return "coffe";

    }


}
