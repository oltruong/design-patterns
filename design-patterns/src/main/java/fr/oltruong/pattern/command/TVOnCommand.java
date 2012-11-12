package fr.oltruong.pattern.command;

import fr.oltruong.pattern.command.receiver.TV;

public class TVOnCommand
    implements Command
{

    private TV tv;

    public TVOnCommand()
    {
        tv = new TV();
    }

    public void execute()
    {
        tv.turnOn();

    }

}
