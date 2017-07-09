package net.adrianlehmann.swt_revision.patterns.variation_patterns;

import java.util.Arrays;
import java.util.List;

/**
 * Created by adrianlehmann on 09.07.17.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Test","abc");
        Sorter s = new BubbleSort();
        s.sort(list);
        s = new QuickSort();
        s.sort(list);
    }
}
