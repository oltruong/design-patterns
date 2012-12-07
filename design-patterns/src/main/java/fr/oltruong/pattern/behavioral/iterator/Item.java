package fr.oltruong.pattern.behavioral.iterator;

/**
 * @author oltruong
 */
public class Item
{

    private String name;

    private float price;

    public Item( String name, float price )
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price;
    }

}
