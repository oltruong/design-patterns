package fr.oltruong.pattern.behavioral.command;

public class RemoteControlInvoker
{

    private Command command1;

    private Command command2;

    private Command command3;

    private Command command4;

    public Command getCommand1()
    {
        return command1;
    }

    public void setCommand1( Command command1 )
    {
        this.command1 = command1;
    }

    public Command getCommand2()
    {
        return command2;
    }

    public void setCommand2( Command command2 )
    {
        this.command2 = command2;
    }

    public Command getCommand3()
    {
        return command3;
    }

    public void setCommand3( Command command3 )
    {
        this.command3 = command3;
    }

    public Command getCommand4()
    {
        return command4;
    }

    public void setCommand4( Command command4 )
    {
        this.command4 = command4;
    }

}
