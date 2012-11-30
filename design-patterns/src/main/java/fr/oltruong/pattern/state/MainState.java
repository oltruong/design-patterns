package fr.oltruong.pattern.state;

/**
 * The pattern State is used to represent the state of an object. This is a clean way for an object to partially change
 * its type at runtime.
 * 
 * @author oltruong
 */
public class MainState
{

    public static void main( String[] args )
    {
        Baby baby = new Baby();

        baby.goToSleep();

        baby.play();
        baby.feed();

        baby.goToSleep();
        baby.feed();

    }

}
