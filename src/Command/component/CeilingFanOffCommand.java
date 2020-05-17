package Command.component;

import Command.definition.Command;
import Command.model.CeilingFan;

public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.high();
    }
}
