package net.adrianlehmann.swt_revision.patterns.variation_patterns.visitor;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class SpillVisitor implements ComputerComponentVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println(spill(computer));
    }

    @Override
    public void visit(CPU cpu) {
        System.out.println(spill(cpu));
    }

    @Override
    public void visit(RAM ram) {
        System.out.println(spill(ram));
    }

    @Override
    public void visit(GraphicsCard graphicsCard) {
        System.out.println(spill(graphicsCard));
    }

    private String spill(ComputerComponent computerComponent) {
        return String.format("Spilling on %s", computerComponent.getName());
    }
}
