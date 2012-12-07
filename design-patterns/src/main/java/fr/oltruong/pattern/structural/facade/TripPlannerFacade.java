package fr.oltruong.pattern.structural.facade;

public class TripPlannerFacade
{

    private Airline airline = new Airline();

    private Hotel hotel = new Hotel();

    private SafariRide safari = new SafariRide();

    /**
     * Complexity is handled by the facade
     */
    public void planTrip()
    {
        System.out.println( "Let Facade plan a trip" );
        airline.bookTicket();
        hotel.bookRoom();
        safari.buyTickets();
    }

    public void cancelTrip()
    {
        System.out.println( "Let Facade cancel the trip" );
        airline.cancelTicket();
        hotel.cancelRoom();
        safari.cancelTickets();
    }

}
