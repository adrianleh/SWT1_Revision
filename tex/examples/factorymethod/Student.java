package net.adrianlehmann.swt_revision.patterns.variation_patterns.factory_method;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public abstract class Student {
    private Smartphone phone;

    public Student() {
        this.phone = makeSmartPhone();
    }

    @Override
    public String toString() {
        return phone.getClass().getSimpleName(); //This will print the name of the specific class of phone
    }

    public abstract Smartphone makeSmartPhone();
}
