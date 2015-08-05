package com.oltruong.pattern.structural.proxy;

/**
 * A proxy, in its most general form, is a class functioning as an interface to something else
 * 
 * @author oltruong
 */
public class MainProxy
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {

        EmployeeInterface employeeP = new EmployeeProxy( new RealEmployee() );
        employeeP.work();

        System.out.println( "Salary: " + employeeP.getSalary() );

    }

}
