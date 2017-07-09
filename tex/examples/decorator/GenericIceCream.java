package net.adrianlehmann.swt_revision.patterns.variation_patterns.decorator;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class GenericIceCream implements IceCream{
    @Override
    public double getCost() {
        return 0.7;
    }

    @Override
    public String getFlavor() {
        return "Vanilla";
    }
}
