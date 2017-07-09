package net.adrianlehmann.swt_revision.patterns.variation_patterns.decorator;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public abstract class IceCreamDecorator implements IceCream{
    protected final IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost();
    }

    @Override
    public String getFlavor() {
        return iceCream.getFlavor();
    }
}
