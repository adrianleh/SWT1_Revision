package net.adrianlehmann.swt_revision.patterns.control.command;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;
/**
 * Created by adrianlehmann on 23.07.17.
 */
public class CommandHandler {
    private static Optional<CommandHandler> commandHandler = Optional.empty();
    private final HashMap<String, Command> commands;

    private CommandHandler() {
        this.commands = new HashMap<>();
    }

    public void addCommand(String s, Command command) {
        commands.putIfAbsent(s, command);
    }

    public void executeCommand(String s) {
        Optional.ofNullable(commands.get(s)).orElseThrow(IllegalArgumentException::new).apply();
    }

    public Collection<Command> getCommands() {
        return commands.values();
    }

    //Using singleton pattern
    public static CommandHandler getInstance() {
        return commandHandler.orElseGet(() -> {
            commandHandler = Optional.of(new CommandHandler());
            return commandHandler.get();
        });
    }

}
