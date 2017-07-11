package net.adrianlehmann.swt_revision.patterns.variation_patterns.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        List<ComputerComponentVisitor> computerComponentVisitors = Arrays.asList(new SpillVisitor(), new FixVisitor());
        computerComponentVisitors.forEach(computer::accept);
        // Spilling on CPU
        // Spilling on GraphicsCard
        // Spilling on RAM
        // Spilling on Comput0r
        // Applying 10kg thermal paste
        // Removing fans for more direct air access for GPU
        // Adding RGB
        // Throwing screwdriver
    }
}
