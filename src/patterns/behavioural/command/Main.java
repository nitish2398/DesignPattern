package patterns.behavioural.command;

import patterns.behavioural.command.impl.IntensityControlCommand;
import patterns.behavioural.command.impl.LightOffCommand;
import patterns.behavioural.command.impl.LightOnCommand;
import patterns.behavioural.command.interfaces.Command;
import patterns.behavioural.command.model.Light;

/**
 * Command Pattern encapsulates a Request and thereby letting you parameterize other objects withs their request,
 * supporting Queue, execute and undo operations.
 *
 */
public class Main {
    /**
     * Things Command pattern must have:
     *        1. Object for which commands are required - Example light
     *        2. Command interface with execute method
     *        3. Command implementations with various possible commands like - LightOn, LightOff,
     *           IntensityChangeCommand, FlickerCommand, etc.
     *        4. A RemoteController Class which composite patterns.behavioural.command interface and execute them.
     */
    public static void main(String[] args) {
        Light light = new Light(100, Light.State.OFF);

        printState(light);

        CommandExecutor remote = new CommandExecutor();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        System.out.println("Turn ON light");
        remote.setCommand(lightOn).execute();
        printState(light);

        System.out.println("Turn OFF light");
        remote.setCommand(lightOff).execute();
        printState(light);

        System.out.println("Undo TurnOff light");
        remote.setCommand(lightOff).undo();
        printState(light);

        System.out.println("Decrease intensity to 50%");
        Command intensity = new IntensityControlCommand(light, 50);
        remote.setCommand(intensity).execute();
        printState(light);
    }

    private static void printState(Light light) {
        System.out.println("------------------------------------------");
        System.out.println(light);
        System.out.println("------------------------------------------");
    }
}
