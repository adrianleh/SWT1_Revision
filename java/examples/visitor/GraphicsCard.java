package net.adrianlehmann.swt_revision.patterns.variation_patterns.visitor;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class GraphicsCard implements ComputerComponent {
    @Override
    public void accept(ComputerComponentVisitor visitor) {
        visitor.visit(this);
    }
}
