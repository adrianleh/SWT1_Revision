package net.adrianlehmann.swt_revision.patterns.variation_patterns.visitor;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public interface ComputerComponent {
    default String getName(){
        return this.getClass().getSimpleName();
    }

    void accept(ComputerComponentVisitor visitor);
}
