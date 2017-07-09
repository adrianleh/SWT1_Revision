package net.adrianlehmann.swt_revision.patterns.variation_patterns.templatemethod;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class MateTea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Adding leaves");
    }
}
