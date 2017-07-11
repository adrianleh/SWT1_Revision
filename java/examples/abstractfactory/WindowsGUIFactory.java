package net.adrianlehmann.swt_revision.patterns.variation_patterns.abstractfactory;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class WindowsGUIFactory implements GUIFactory {
    @Override
    public NavBar makeNavBar() {
        return () -> System.out.println("Sorry I crashed");
    }
}
