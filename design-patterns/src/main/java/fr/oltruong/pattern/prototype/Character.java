package fr.oltruong.pattern.prototype;

/**
 * @author oltruong
 */
public class Character
    implements Prototype
{

    private String name;

    @Override
    public Character clone()
    {

        Character clone = new Character();
        clone.setName( name );
        return clone;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
