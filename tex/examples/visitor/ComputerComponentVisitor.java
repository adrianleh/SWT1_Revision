package net.adrianlehmann.swt_revision.patterns.variation_patterns.visitor;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public interface ComputerComponentVisitor {
    void visit(Computer computer);
    void visit(CPU cpu);
    void visit(RAM ram);
    void visit(GraphicsCard graphicsCard);
}
