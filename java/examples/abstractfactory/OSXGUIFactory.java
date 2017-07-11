package net.adrianlehmann.swt_revision.patterns.variation_patterns.abstractfactory;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class OSXGUIFactory implements GUIFactory {
    @Override
    public NavBar makeNavBar() {
        return () -> System.out.println("I am a NavBar");
    }
}
