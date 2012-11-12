package fr.oltruong.pattern.command;

import fr.oltruong.pattern.command.receiver.MusicPlayer;

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
