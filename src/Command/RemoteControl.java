package Command;

import Command.component.Command;
import Command.component.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- Remote Control -----\n");

        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append(String.format(
                    "[slot %s]\t%s\t%s\n",
                    i,
                    onCommands[i].getClass().getName(),
                    offCommands[i].getClass().getName()));
        }

        stringBuilder.append(String.format(
                "[undo]\t%s\n",
                undoCommand.getClass().getName()));

        return stringBuilder.toString();
    }
}
