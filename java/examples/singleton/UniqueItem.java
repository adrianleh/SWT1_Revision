package net.adrianlehmann.swt_revision.patterns.other.singleton;

import java.util.Optional;

/**
 * Created by adrianlehmann on 22.07.17.
 */
public class UniqueItem {
    private static Optional<UniqueItem> uniqueItem = Optional.empty();

    private UniqueItem() {/*Stuff*/}

    public static UniqueItem getInstance() {
        return uniqueItem.orElseGet(() -> {
            uniqueItem = Optional.of(new UniqueItem());
            return uniqueItem.get();
        });
    }
}
