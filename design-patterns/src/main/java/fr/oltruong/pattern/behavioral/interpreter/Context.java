package fr.oltruong.pattern.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oltruong
 */
public class Context
{

    private List<String> sequence;

    public Context( List<String> sequence )
    {
        this.sequence = sequence;
        if ( sequence == null )
        {
            this.sequence = new ArrayList<String>();
        }
    }

    public void addSequence( String value )
    {
        sequence.add( value );
    }

    public String getElement()
    {
        String element = sequence.get( 0 );
        sequence.remove( 0 );
        return element;
    }

}
