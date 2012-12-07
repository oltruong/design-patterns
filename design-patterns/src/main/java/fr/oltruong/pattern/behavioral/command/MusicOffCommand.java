package fr.oltruong.pattern.behavioral.command;

import fr.oltruong.pattern.behavioral.command.receiver.MusicPlayer;

public class MusicOffCommand
    implements Command
{

    private MusicPlayer music;

    public MusicOffCommand()
    {
        music = new MusicPlayer();
    }

    public void execute()
    {
        music.stopMusic();
    }

}
