package net.adrianlehmann.swt_revision.patterns.variation_patterns.visitor;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class FixVisitor implements ComputerComponentVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Throwing screwdriver");
    }

    @Override
    public void visit(CPU cpu) {
        System.out.println("Applying 10kg thermal paste");
    }

    @Override
    public void visit(RAM ram) {
        System.out.println("Adding RGB");
    }

    @Override
    public void visit(GraphicsCard graphicsCard) {
        System.out.println("Removing fans for more direct air access for GPU");
    }
}
