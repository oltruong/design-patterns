package fr.oltruong.pattern.structural.facade;

/**
 * Facade pattern simplifies a set of interfaces in a subsystem
 * 
 * @author oltruong
 */
public class MainFacade
{

    public static void main( String[] args )
    {
        TripPlannerFacade facade = new TripPlannerFacade();

        facade.planTrip();

        facade.cancelTrip();
    }

}
