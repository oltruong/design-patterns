package com.oltruong.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oltruong
 */
public class House
    implements Element
{

    private List<Element> elements = new ArrayList<Element>();

    public House()
    {
        elements.add( new Basement() );
        elements.add( new Kitchen() );
        elements.add( new BedRoom() );
    }

    public void accept( Visitor visitor )
    {

        for ( Element element : elements )
        {
            element.accept( visitor );
        }

    }

}
