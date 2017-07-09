package net.adrianlehmann.swt_revision.patterns.variation_patterns.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class Computer implements ComputerComponent {
    List<ComputerComponent> componentList;

    public Computer() {
        componentList = Arrays.asList(new CPU(), new GraphicsCard(), new RAM());
    }

    @Override
    public String getName() {
        return "Comput0r";
    }

    @Override
    public void accept(ComputerComponentVisitor visitor) {
        this.componentList.forEach(computerComponent -> computerComponent.accept(visitor));
        visitor.visit(this);
    }
}
