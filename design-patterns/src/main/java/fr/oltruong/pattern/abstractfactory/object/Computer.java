package fr.oltruong.pattern.abstractfactory.object;

public abstract class Computer
{

    String name;

    Processor processor;

    HardDrive hardDrive;

    Keyboard keyboard;

    public abstract void prepare();

    public void setName( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void assemble()
    {
        System.out.println( "assembling computer" );
    }

    public void test()
    {
        System.out.println( "testing computer" );
    }

    public void packageAll()
    {
        System.out.println( "packaging computer" );
    }
}
