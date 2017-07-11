package net.adrianlehmann.swt_revision.patterns.variation_patterns.decorator;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new GenericIceCream();
        IceCream decoratedIceCream = new WithCaramel(iceCream);

        //Print costs
        System.out.println(iceCream.getCost()); // 0.7
        System.out.println(decoratedIceCream.getCost()); // 1.2


        //Print flavors
        System.out.println(iceCream.getFlavor()); //Vanilla
        System.out.println(decoratedIceCream.getFlavor()); //Vanilla, Caramel
    }
}
