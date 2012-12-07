package fr.oltruong.pattern.structural.proxy;

/**
 * @author oltruong
 */
public class EmployeeProxy
    implements EmployeeInterface
{

    private RealEmployee employee;

    public EmployeeProxy( RealEmployee employee )
    {
        this.employee = employee;
    }

    public void work()
    {
        System.out.println( "Making my RealEmployee work" );
        employee.work();

    }

    public float getSalary()
    {
        // Add 15%
        System.out.println( "I'm adding 15%" );
        return ( employee.getSalary() * 1.15f );
    }

}
