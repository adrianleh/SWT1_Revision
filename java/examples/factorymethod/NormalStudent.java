package net.adrianlehmann.swt_revision.patterns.variation_patterns.factory_method;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class NormalStudent extends Student{
    @Override
    public Smartphone makeSmartPhone() {
        return new GenericSmartphone();
    }
}
