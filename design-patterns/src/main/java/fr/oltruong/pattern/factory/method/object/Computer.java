package fr.oltruong.pattern.factory.method.object;

public abstract class Computer
{

    public void prepare()
    {
        System.out.println( "preparing computer" );
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
