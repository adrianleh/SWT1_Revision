package net.adrianlehmann.swt_revision.patterns.variation_patterns.templatemethod;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public abstract class CaffeineBeverage {
    public void prepare() {
        brew();
        boil();
        give();
    }

    public abstract void brew();

    public void boil() {
        System.out.println("Boiling");
    }

    public void give() {
        System.out.println("Giving to poor sleepless student");
    }
}
