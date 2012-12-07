package fr.oltruong.pattern.behavioral.command;

import fr.oltruong.pattern.behavioral.command.receiver.MusicPlayer;

public class MusicOnCommand
    implements Command
{

    private MusicPlayer music;

    public MusicOnCommand()
    {
        music = new MusicPlayer();
    }

    public void execute()
    {
        music.startMusic();
    }

}
