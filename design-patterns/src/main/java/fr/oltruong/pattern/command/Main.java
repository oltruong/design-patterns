package fr.oltruong.pattern.command;

/**
 * Command pattern's principle: define a command as an object This class is the client here
 * 
 * @author oltruong
 */
public class Main
{

    public static void main( String[] args )
    {

        RemoteControlInvoker invoker = new RemoteControlInvoker();
        invoker.setCommand1( new TVOnCommand() );
        invoker.setCommand2( new TVOnCommand() );

        invoker.setCommand3( new MusicOnCommand() );
        invoker.setCommand4( new MusicOffCommand() );

        invoker.getCommand1().execute();
        invoker.getCommand2().execute();
        invoker.getCommand3().execute();
        invoker.getCommand4().execute();
    }
}
