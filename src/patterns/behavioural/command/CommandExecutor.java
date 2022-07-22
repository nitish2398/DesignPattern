package patterns.behavioural.command;

import patterns.behavioural.command.interfaces.Command;

public class CommandExecutor implements Command {
    private Command command;

    @Override
    public void execute() {
        command.execute();
    }

    @Override
    public void undo() {
        command.undo();
    }

    public Command setCommand(Command command) {
        this.command = command;
        return this;
    }
}
