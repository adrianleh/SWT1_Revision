package net.adrianlehmann.swt_revision.patterns.variation_patterns.factory_method;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new NormalStudent()); //GenericSmartphone
        System.out.println(new BusinessStudent()); //uPhone
    }
}
