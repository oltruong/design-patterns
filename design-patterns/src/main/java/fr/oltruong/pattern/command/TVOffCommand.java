package fr.oltruong.pattern.command;

import fr.oltruong.pattern.command.receiver.TV;

public class TVOffCommand
    implements Command
{

    private TV tv;

    public TVOffCommand()
    {
        tv = new TV();
    }

    public void execute()
    {
        tv.turnOff();

    }

}
