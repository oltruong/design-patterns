package fr.oltruong.pattern.proxy;

/**
 * @author oltruong
 */
public class RealEmployee
    implements EmployeeInterface
{

    public void work()
    {
        System.out.println( "I'm working" );
    }

    public float getSalary()
    {
        System.out.println( "My salary is 500" );
        return 500f;
    }

}
