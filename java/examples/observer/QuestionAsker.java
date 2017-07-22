package net.adrianlehmann.swt_revision.patterns.decoupling_patterns.observer;
/**
 * Created by adrianlehmann on 22.07.17.
 */
public class QuestionAsker {
    public static void main(String[] args) {
        System.out.println("How are you?");
        InputSubject inputSubject = new InputSubject();
        inputSubject.addObserver((obj, arg) -> System.out.println("Received response: " + arg));
        new Thread(inputSubject).start();
    }
}

