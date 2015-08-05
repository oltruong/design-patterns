package com.oltruong.pattern.behavioral.command;

import com.oltruong.pattern.behavioral.command.receiver.TV;

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
