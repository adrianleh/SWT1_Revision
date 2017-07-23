package net.adrianlehmann.swt_revision.patterns.control.command;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by adrianlehmann on 23.07.17.
 */
public class Main {
    public static void main(String[] args) {
        CommandHandler commandHandler = CommandHandler.getInstance();
        commandHandler.addCommand("test", () -> System.out.println("Hi"));
        commandHandler.addCommand("time", () -> System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date())));
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            commandHandler.executeCommand(sc.next()); //Data Validation would be required
        }
    }
    /*
     * Key: -> = Input; <- = Output
     * <- test
     * -> Hi
     * <- time
     * -> (the current time)
     * <- time
     * -> (the current time)
     * <- test
     * -> Hi
     */
}
