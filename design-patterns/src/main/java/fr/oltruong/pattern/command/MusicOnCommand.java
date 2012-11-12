package fr.oltruong.pattern.command;

import fr.oltruong.pattern.command.receiver.MusicPlayer;

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
