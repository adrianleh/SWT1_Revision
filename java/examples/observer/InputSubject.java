package net.adrianlehmann.swt_revision.patterns.decoupling_patterns.observer;
import java.util.Observable;
import java.util.Scanner;
/**
 * Created by adrianlehmann on 22.07.17.
 */
public class InputSubject extends Observable implements Runnable {
    public void run() {
        while (true) {
            setChanged();
            notifyObservers(new Scanner(System.in).next());
        }
    }
}
