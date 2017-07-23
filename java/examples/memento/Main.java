package net.adrianlehmann.swt_revision.patterns.other.memento;

import java.util.Scanner;

/**
 * Created by adrianlehmann on 23.07.17.
 */
public class Main {
    public static void main(String[] args) {
        TextStorer textStorer = new TextStorer();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("end")) {
                break;
            }
            textStorer.add(s);
        }
        while (sc.hasNext()) {
            textStorer.restoreTo(sc.nextInt());
            System.out.println(textStorer.getText());
        }
        sc.close();
    }
    /*
     * Key: -> = Input; <- = Output
     *  -> a
     *  -> b
     *  -> c
     *  -> end
     *  -> 0
     *  <- a
     *  -> 2
     *  <- abc
     *  -> 1
     *  <- ab
     */
}
