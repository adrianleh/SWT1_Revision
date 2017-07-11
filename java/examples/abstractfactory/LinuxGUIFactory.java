package net.adrianlehmann.swt_revision.patterns.variation_patterns.abstractfactory;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class LinuxGUIFactory implements GUIFactory {
    @Override
    public NavBar makeNavBar() {
        return () -> System.out.println("You shouldn't have a GUI here");
    }
}
