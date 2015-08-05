package com.oltruong.pattern.behavioral.command;

import com.oltruong.pattern.behavioral.command.receiver.TV;

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
